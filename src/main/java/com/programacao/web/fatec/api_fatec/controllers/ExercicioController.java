package com.programacao.web.fatec.api_fatec.controllers;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ExercicioController {

    @GetMapping
    public String HelloWorld(){
        return "Hell o";
    }
}