package com.jonh.bankline.api.modells;

public class Correntista {

    private Integer id;
    private String cpf;
    private String nome;

    private Conta conta;
    
    public Conta getConta() {
        return conta;
    }
    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public Integer getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    
    
}
