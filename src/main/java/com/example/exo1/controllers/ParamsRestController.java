package com.example.exo1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/base")
public class ParamsRestController {

//    @GetMapping(value = "1-param")
//    @ResponseBody
//    public List<String> unParam() {
//        return List.of("Harley");
//    }

//    @GetMapping(value = "2-params")
//    @ResponseBody
//    public List<String> deuxParam() {
//        return List.of("Harley", "Ivy");
//    }

//    @GetMapping(value = "params")
//    @ResponseBody
//    public List<String> personJson(){
//        return List.of("John Dupont", "Maria Martez", "Chloé Smith");
//    }

    @GetMapping("1-param")
    public String get1Param(){
    return "Harley";
    }

    @GetMapping("params")
    public List<String> getCollParams(){
        return List.of("Harley", "Ivy");
    }
}
