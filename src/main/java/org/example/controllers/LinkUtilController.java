package org.example.controllers;


import org.example.models.LinkUtil;
import org.example.services.impl.LinkUtilServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/links")
public class LinkUtilController {

    @Autowired
    private LinkUtilServiceImpl service;

    @GetMapping
    public List<LinkUtil> getAll(){return service.getAll();}
}
