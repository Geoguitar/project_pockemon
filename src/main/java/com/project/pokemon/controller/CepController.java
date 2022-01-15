package com.project.pokemon.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.project.pokemon.entity.Cep;
import com.project.pokemon.service.CepService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
@Slf4j
public class CepController {
	
	CepService cepService;
	
	@PostMapping("/cep")
	@ResponseStatus(HttpStatus.CREATED)
	public Cep createCep (@RequestBody Cep cep) {
		log.info("Criando novo dado no CEP [{}]", cep);
		return cepService.createCep(cep);
	}
	
	@GetMapping("/cep")
	@ResponseStatus(HttpStatus.OK)
	public List<Cep> getAllCep(){
		log.info("Listando os dados de CEP [{}]");
		return cepService.listarCep();
	}

}
