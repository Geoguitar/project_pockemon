package com.project.pokemon.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping("/cep/{id}")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Cep> getCepById(@PathVariable (value = "id") Long id) {
		log.info("Listando por ID os dados de CEP [{}]", id);
		return cepService.findCepById(id);
	}
	
	@PutMapping("/cep/{id}")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Cep> updateCepById (@PathVariable (value = "id") Long id, @RequestBody Cep cep){
		log.info("Atualizando por ID os dados no CEP [{}]", id);
		return cepService.updateCepById(cep, id);
	}
	
	@DeleteMapping("/cep/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public ResponseEntity<Object> deleteCepById (@PathVariable (value = "id") Long id){
		log.info("Apagando os dados por ID do CEP [{}]", id);
		return cepService.deleteById(id);
	}
}




















