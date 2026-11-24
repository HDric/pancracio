package com.panaderia.pancracio.controller;

import com.panaderia.pancracio.model.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsuarioController {

    @GetMapping("/gestionUsuarios")
    public String gestionUsuarios(Model model) {
        Usuario usuario = new Usuario(
                1,
                2,
                1,
                "Dylan Huilca",
                "1729112076",
                "dylan.huilca@gmail.com",
                "dylan.huilca"
        );
        model.addAttribute("usuario", usuario);
        return "gestionUsuarios";
    }
}
