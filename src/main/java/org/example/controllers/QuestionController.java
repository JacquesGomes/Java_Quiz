package org.example.controllers;

import org.example.models.Questao;
import org.example.models.form.QuestaoForm;
import org.example.services.impl.QuestionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/questoes")
public class QuestionController {

    @Autowired
    private QuestionServiceImpl service;

    @CrossOrigin(origins = "*")
    @GetMapping
    public List<Questao> getAll() {return service.getAll();}

    @PostMapping
    public Questao create(@RequestBody QuestaoForm form){
        return service.create(form);
    }
}
