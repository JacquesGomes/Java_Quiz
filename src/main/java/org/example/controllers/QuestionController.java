package org.example.controllers;

import org.example.models.Questao;
import org.example.models.form.QuestaoForm;
import org.example.services.impl.QuestionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/questoes")
public class QuestionController {

    @Autowired
    private QuestionServiceImpl service;

    @CrossOrigin(origins = "https://jacquesgomes.com.br/quizTech/")
    @GetMapping
    public Page<Questao> getQuestoesPaginadas(@RequestParam(defaultValue = "0") int page) {
        Pageable pageable = PageRequest.of(page, 5);
        return service.getPaginatedQuestions(pageable);
    }

    @CrossOrigin(origins = "https://jacquesgomes.com.br/quizTech/")
    @GetMapping("/gabarito/{questionId}")
    public List<String> getGabarito(@PathVariable Long questionId) {
        return service.getGabarito(questionId);
    }
    @PostMapping("/create-multiple")
    public List<Questao> createMultiple(@RequestBody List<QuestaoForm> forms) {
        List<Questao> createdQuestoes = new ArrayList<>();

        for (QuestaoForm form : forms) {
            Questao createdQuestao = service.create(form);
            createdQuestoes.add(createdQuestao);
        }

        return createdQuestoes;
    }

    @PostMapping
    public Questao create(@RequestBody QuestaoForm form){

        return service.create(form);
    }
}
