package com.jonh.bankline.repository;

import com.jonh.bankline.api.modells.Correntista;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CorrentistaRepository extends JpaRepository<Correntista, Integer> {
    
    
}
