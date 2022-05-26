package com.jonh.bankline.api.controllers;

import java.util.List;

import com.jonh.bankline.api.modells.Correntista;
import com.jonh.bankline.repository.CorrentistaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/correntistas")
public class CorrentistaController {

    @Autowired
    private CorrentistaRepository correntistaRepository;

    @GetMapping
    public List<Correntista> findAll(){
        return correntistaRepository.findAll();
    }
    
    @PostMapping
    public void salve(@RequestBody Correntista correntista){

    }
}
