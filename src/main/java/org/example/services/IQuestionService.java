package org.example.services;

import org.example.models.Questao;
import org.example.models.form.QuestaoForm;

import java.util.List;

public interface IQuestionService {
    List<Questao> getAll();

    Questao create(QuestaoForm form);
}
