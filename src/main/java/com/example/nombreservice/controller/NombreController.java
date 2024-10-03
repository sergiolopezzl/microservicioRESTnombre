package com.example.nombreservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NombreController {

    @GetMapping("/mi-nombre")
    public String obtenerNombre() {
        return "Mi nombre es Sergio Lopez";
    }
}
