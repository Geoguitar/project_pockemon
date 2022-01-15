package com.project.pokemon.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.project.pokemon.entity.Localizacao;
import com.project.pokemon.service.LocalizacaoService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
@Slf4j
public class LocalizacaoController {
		
	LocalizacaoService localizacaoService;	
	
	@PostMapping("/localizacao")
	@ResponseStatus(HttpStatus.CREATED)
	public Localizacao createLocalizacao (@RequestBody Localizacao localizacao) {
		log.info("Criando novo dado na Localização [{}]", localizacao);
		return localizacaoService.createLocalizacao(localizacao);
	}
	
	@GetMapping("/localizacao")
	@ResponseStatus(HttpStatus.OK)
	public List<Localizacao> listaLocalizacao(){
		log.info("Listando os dados de Localização [{}]");
		return localizacaoService.listLocalizacao();
	}
	
	@GetMapping("/localizacao/{id}")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Localizacao> getLocalizacaoById(@PathVariable (value = "id") Long id){
		log.info("Listando por ID os dados de Localização [{}], id");
		return localizacaoService.findLocalizacaoById(id);
	}
	
	public ResponseEntity<Localizacao> updateLocalizacaoById (@PathVariable (value = "id") Long id, 
			@RequestBody Localizacao localizacao){
			return localizacaoService.updateLocalizacaoById(localizacao, id);
					
		
	}
}
















