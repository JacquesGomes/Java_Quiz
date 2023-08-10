package org.example.services.impl;

import org.example.models.Comentario;
import org.example.repositories.ComentarioRepository;
import org.example.services.IComentarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComentarioServiceImpl implements IComentarioService {


    @Autowired
    private ComentarioRepository repository;

    @Override
    public List<Comentario> getAll() {
        return repository.findAll();
    }


}
