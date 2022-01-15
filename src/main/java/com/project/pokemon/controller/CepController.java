package com.project.pokemon.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
	
	public Cep createCep (@RequestBody Cep cep) {
		log.info("Criando novo dado no CEP [{}]", cep);
		return cepService.createCep(cep);
	}

}
