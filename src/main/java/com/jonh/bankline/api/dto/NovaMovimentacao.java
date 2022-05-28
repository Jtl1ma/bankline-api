package com.jonh.bankline.api.dto;

import com.jonh.bankline.api.modells.MovimentacaoTipo;

import lombok.Data;
@Data
public class NovaMovimentacao {

    private String descricao;
    private Double valor;
    private MovimentacaoTipo tipo;
    private Integer idConta;
    
}
