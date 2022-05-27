package com.jonh.bankline.api.dto;

import com.jonh.bankline.api.modells.MovimentacaoTipo;

import lombok.Data;
@Data
public class NovaMovimentacao {

    private Double valor;
    private String descricao;
    private MovimentacaoTipo tipo;
    private Integer idConta;
    
}
