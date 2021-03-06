package com.jonh.bankline.api.services;

import java.time.LocalDateTime;

import com.jonh.bankline.api.dto.NovaMovimentacao;
import com.jonh.bankline.api.modells.Correntista;
import com.jonh.bankline.api.modells.Movimentacao;
import com.jonh.bankline.api.modells.MovimentacaoTipo;
import com.jonh.bankline.api.repository.CorrentistaRepository;
import com.jonh.bankline.api.repository.MovimentacaoRepository;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class MovimentacaoService {
    @Autowired
    private MovimentacaoRepository movimentacaoRepository;
    @Autowired
    private CorrentistaRepository correntistaRepository;

    public void save(NovaMovimentacao novaMovimentacao){
        Movimentacao movimentacao = new Movimentacao();
        
       // Double valor = novaMovimentacao.getTipo()==MovimentacaoTipo.RECEITA ? novaMovimentacao.getValor() : novaMovimentacao.getValor() * -1;
      Double valor = novaMovimentacao.getValor();
        if (novaMovimentacao.getTipo() == MovimentacaoTipo.DESPESA)
            valor = valor * -1;
    
        movimentacao.setDataHora(LocalDateTime.now());
        movimentacao.setDescricao(novaMovimentacao.getDescricao());
        movimentacao.setIdConta(novaMovimentacao.getIdConta());
        movimentacao.setTipo(novaMovimentacao.getTipo());
        movimentacao.setValor(valor);

        Correntista correntista = correntistaRepository.findById(novaMovimentacao.getIdConta()).orElse(null);
        if(correntista != null){
          correntista.getConta().setSaldo(correntista.getConta().getSaldo() + valor);
          correntistaRepository.save(correntista);
        }
      //  movimentacao.setValor(novaMovimentacao.getValor());
        movimentacaoRepository.save(movimentacao);
		//novaMovimentacao.save(movimentacao);
    }
    
}
