package com.jonh.bankline.api.modells;

public class Conta {

    private Long numero;
    private Double saldo;
    
    public Long getNumero() {
        return numero;
    }
    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    public void setNumero(Long numero) {
        this.numero = numero;
    }
    
}
