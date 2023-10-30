package com.example.exo1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/base")
public class ParamsController {

//    @RequestMapping(value = "1-param")
////    @ResponseBody
//    public String unParam(Model model) {
//        model.addAttribute("firstperson", "Harley");
//        return "param1";
//    }

//    @RequestMapping(value = "2-params")
////    @ResponseBody
//    public String deuxParam(Model model) {
//        model.addAttribute("firstperson", "Harley");
//        model.addAttribute("secondperson", "Ivy");
//        return "param2";
//    }

//    @RequestMapping(value = "coll-params")
////    @ResponseBody
//    public String personName(Model model){
//        List<String> persons = List.of("John Dupont", "Maria Martez", "Chloé Smith");
////        List<String> persons = List.of();
//        model.addAttribute("persons", persons);
//        return "allPersons";
//    }

//    CORRECTION

    @GetMapping("1-param")
    public String getOneParam(Model model){
        model.addAttribute("paramA", "Harley");
        return "1-param";
    }

    @GetMapping("2-param")
    public String getTwoParam(Model model){
        model.addAttribute("paramA", "Harley");
        model.addAttribute("paramB", "Ivy");
        return "2-param";
    }

    @GetMapping("coll-params")
//    @ResponseBody
    public String getCollParams(Model model){
        List<String> persons = List.of("John Dupont", "Maria Martez", "Chloé Smith");
//        List<String> persons = List.of();
        model.addAttribute("persons", persons);
        return "allPersons";
    }
}
