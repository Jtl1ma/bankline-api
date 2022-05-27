package com.jonh.bankline.api.services;

import java.util.Date;

import com.jonh.bankline.api.dto.NovoCorrentista;
import com.jonh.bankline.api.modells.Conta;
import com.jonh.bankline.api.modells.Correntista;
import com.jonh.bankline.api.repository.CorrentistaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CorrentistaService {

    @Autowired
    private CorrentistaRepository cr;
    
    public void save(NovoCorrentista nc){
        Correntista correntista = new Correntista();
        correntista.setCpf(nc.getCpf()); //set determina e get recebe a informação
        correntista.setNome(nc.getNome());

        Conta conta = new Conta();
        conta.setSaldo(0.0);
        conta.setNumero(new Date().getTime());
        
        correntista.setConta(conta);
        cr.save(correntista);

    }
    
}
