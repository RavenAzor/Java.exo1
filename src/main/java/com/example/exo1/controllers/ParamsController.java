package com.example.exo1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping(value = "/api/v1/base")
public class ParamsController {

    @RequestMapping(value = "1-param")
//    @ResponseBody
    public String unParam(Model model){
        model.addAttribute("firstperson", "Harley");
        return "param1";
    }

    @RequestMapping(value = "2-params")
//    @ResponseBody
    public String deuxParam(Model model){
        model.addAttribute("firstperson", "Harley");
        model.addAttribute("secondperson", "Ivy");
        return "param2";
    }

//    @ResponseBody
//    @RequestMapping(value = "/params")
//    public String personName(Model model) {
//        List<String> persons = List.of("John Dupont", "Maria Martez", "Chloé Smith");
////        List<String> persons = List.of();
//        model.addAttribute("persons", persons);
//        return "allPersons";
//    }

    @GetMapping(value = "params")
    @ResponseBody
    public List<String> personJson(){
        return List.of("John Dupont", "Maria Martez", "Chloé Smith");
    }
}


//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping(value = "/api/v1/base")
//public class ParamsController {
//
//    @GetMapping
//    public String param1(){
//        return "param1";
//    }
//
//    //    @RequestMapping(value ="/persons")
//    @GetMapping(value = "coll-params")
//    @ResponseBody
//    public List<String> personJson(){
//        return List.of("John Dupont", "Maria Martez", "Chloé Smith");
//    }
//}
