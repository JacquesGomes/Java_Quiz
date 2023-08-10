package org.example.services.impl;

import org.example.models.Questao;
import org.example.models.form.QuestaoForm;
import org.example.repositories.QuestionRepository;
import org.example.services.IQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements IQuestionService{

    @Autowired
    private QuestionRepository repository;

    @Override
    public List<Questao> getAll(){
        return repository.findAll();
    }

    @Override
    public Questao create(QuestaoForm form) {
        Questao questao = new Questao();
        questao.setTitulo(form.getTitulo());
        questao.setResposta(form.getResposta());
        questao.setOpcoes(form.getOpcoes());
        questao.setGabarito_comentado(form.getGabaritoComentado());
        return repository.save(questao);


    }
}
