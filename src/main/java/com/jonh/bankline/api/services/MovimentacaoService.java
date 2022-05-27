package com.jonh.bankline.api.services;

import java.time.LocalDateTime;

import com.jonh.bankline.api.dto.NovaMovimentacao;
import com.jonh.bankline.api.modells.Movimentacao;
import com.jonh.bankline.api.modells.MovimentacaoTipo;
import com.jonh.bankline.api.repository.MovimentacaoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovimentacaoService {
    @Autowired
    private MovimentacaoRepository repository;
    public void save(NovaMovimentacao novaMovimentacao){
        Movimentacao movimentacao = new Movimentacao();
        //Double valor = novaMovimentacao.getTipo()==MovimentacaoTipo.RECEITA ? novaMovimentacao.getValor() : novaMovimentacao.getValor() * -1;
        Double valor = novaMovimentacao.getValor();
        if (novaMovimentacao.getTipo() == MovimentacaoTipo.DESPESA)
            valor = valor * -1;
        movimentacao.setDataHora(LocalDateTime.now());
        movimentacao.setDescricao(novaMovimentacao.getDescricao());
        movimentacao.setIdConta(novaMovimentacao.getIdConta());
        movimentacao.setTipo(novaMovimentacao.getTipo());
        movimentacao.setValor(valor);

        repository.save(movimentacao);
    }
    
}
