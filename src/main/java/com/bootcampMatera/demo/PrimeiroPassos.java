package com.bootcampMatera.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimeiroPassos {

	public static void main(String[] args) {
		boolean isOk = false;
		double numeroDouble = 10.2;
		long numeroLong = 10L;
		long nomeVariavel = 5L;
		var nome = "Júlia";
		int idade = 15;

		if (idade >= 18){
			System.out.println("Pode beber");
		} else{
			System.out.println("Não deveria beber");
		}

		boolean podeBeber = idade >= 18;
		System.out.println(podeBeber);

		while (idade < 18){
			System.out.println("Não deveria dirigir, idade: " + idade);
			idade = idade +1;
		}
		System.out.println("fim");

		for (int i = 0; i< 18; i++){
			System.out.println("valor de i = " + i);
		}

		SpringApplication.run(PrimeiroPassos.class, args);
	}

}
