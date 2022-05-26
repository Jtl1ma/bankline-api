package com.jonh.bankline.repository;

import com.jonh.bankline.api.modells.Movimentacao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Integer> {
    
}
