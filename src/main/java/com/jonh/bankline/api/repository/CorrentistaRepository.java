package com.jonh.bankline.api.repository;

import com.jonh.bankline.api.modells.Correntista;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CorrentistaRepository extends JpaRepository<Correntista, Integer> {
    
    
}
