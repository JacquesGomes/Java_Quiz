package org.example.controllers;

import org.example.models.Questao;
import org.example.services.impl.QuestionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/questoes")
public class QuestionController {

    @Autowired
    private QuestionServiceImpl service;

    @GetMapping
    public List<Questao> getAll() {return service.getAll();}


}
