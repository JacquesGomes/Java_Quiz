package org.example.controllers;


import org.example.models.Comentario;
import org.example.services.impl.ComentarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/comentarios")
public class ComentarioController {

    @Autowired
    private ComentarioServiceImpl service;

    @GetMapping
    public List<Comentario> getAll(){
        return service.getAll();
    }
}
