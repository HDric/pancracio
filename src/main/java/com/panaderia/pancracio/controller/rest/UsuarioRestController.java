package com.panaderia.pancracio.controller.rest;

import java.util.Map;

import com.panaderia.pancracio.model.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UsuarioRestController {

    @GetMapping("/usuarios")
    public Map<String, Object> getUsuarios() {
        Usuario usuario = new Usuario(
                1,
                2,
                1,
                "Luis Teran",
                "1714032587",
                "lteran@gmail.com",
                "lteran"
        );
        return Map.of("usuario", usuario);
    }
}
