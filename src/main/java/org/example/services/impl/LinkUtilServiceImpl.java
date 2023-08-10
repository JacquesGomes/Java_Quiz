package org.example.services.impl;




import org.example.models.LinkUtil;
import org.example.repositories.LinkUtilRepository;
import org.example.services.ILinkUtilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LinkUtilServiceImpl implements ILinkUtilService {

    @Autowired
    private LinkUtilRepository repository;


    @Override
    public List<LinkUtil> getAll() {
        return repository.findAll();
    }
}
