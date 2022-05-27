package com.jonh.bankline.api.controllers;

import java.util.List;

import com.jonh.bankline.api.dto.NovaMovimentacao;
import com.jonh.bankline.api.modells.Movimentacao;
import com.jonh.bankline.api.services.MovimentacaoService;
import com.jonh.bankline.api.repository.MovimentacaoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movimentacoes")
public class MovimentacaoController {

    @Autowired
    private MovimentacaoRepository movimentacaoRepository;

    @Autowired
    private MovimentacaoService service;

    @GetMapping
    public List<Movimentacao> findAll(){
        return movimentacaoRepository.findAll();
    }
    
    @PostMapping
    public void salve(@RequestBody NovaMovimentacao novaMovimentacao){
        service.save(novaMovimentacao);
    }
}
