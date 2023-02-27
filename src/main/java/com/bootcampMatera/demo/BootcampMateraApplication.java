package com.bootcampMatera.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootcampMateraApplication {

    public static void main(String[] args) {
        var pessoa = new Pessoa("Júlia do Teste", "12345678912", 20);
        var pessoa2 = new Pessoa("Júlia do Teste 2", "2324434434", 12);

        System.out.println("Primeira Pessoa = " + pessoa.getNome());
        System.out.println("Segunda Pessoa  = " + pessoa2.getNome());
    }

    }