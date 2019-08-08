package com.wigner.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.wigner.api.utis.SenhaUtils;

@SpringBootApplication
public class MeuPrimeiroProjetoApplication {

	/*
	 * @Value ( "${paginacao.qtd_por_pagina}" ) private int qtdPorPagina ;
	 */
	
	public static void main(String[] args) {
		SpringApplication.run(MeuPrimeiroProjetoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			String senhaEncoded = SenhaUtils.gerarBCrypt("123456");
			System.out.println("Senha encode:" + senhaEncoded);
			
			senhaEncoded = SenhaUtils.gerarBCrypt("123456");
			System.out.println("Senha endcoded novamente:" + senhaEncoded);
			
			System.out.println("Senha válida: " + SenhaUtils.senhaValida("123456", senhaEncoded));
		};
	}
	
}
