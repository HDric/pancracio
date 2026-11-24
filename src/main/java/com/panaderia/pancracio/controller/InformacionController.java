package com.panaderia.pancracio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InformacionController {

    @GetMapping("/informacion")
    public String informacion(Model model) {
        model.addAttribute("titulo", "Datos del Servidor");
        model.addAttribute("app", "APP Pancracio");
        model.addAttribute("ip", "localhost");
        model.addAttribute("descripcion", "Aplicacion para gestionar usuarios");
        return "informacion";
    }
}
