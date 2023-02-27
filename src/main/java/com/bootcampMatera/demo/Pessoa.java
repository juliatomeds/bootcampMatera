package com.bootcampMatera.demo;

public class Pessoa {
    //private long cpf; //se começar com 0 esse valor inicial é perdido, por isso não é legal usar long e sim string
    private String cpf;
    private String nome;
    private int idade;

    public void getCpf (){
        return cpf;
    }

    public void getNome (){
        return this.nome;
    }

    public void getIdade (){
        return this.idade;
    }

    public void setCpf (String cpf){
        this.cpf = cpf;
    }

    public void setNome(String umNome){
        nome = umNome;
    }
}
