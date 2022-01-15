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
import com.project.pokemon.entity.Lista;
import com.project.pokemon.service.ListaService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
@Slf4j
public class ListaController {
	
	ListaService listaService;
	
	@PostMapping("/listas")
	@ResponseStatus(HttpStatus.CREATED)
	public Lista createLista (@RequestBody Lista lista) {
		log.info("Criando novo dado na Lista [{}]", lista);
		return listaService.createLista(lista);
	}
	
	@GetMapping("/listas")
	@ResponseStatus(HttpStatus.OK)
	public List<Lista> getAllLista() {
		log.info("Listando os dados na Lista [{}]");
		return listaService.listar();
	}
	
	@GetMapping("/listas/{id}")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Lista> getListaById(@PathVariable (value = "id") Long id) {
		log.info("Listando por ID os dados na Lista [{}]", id);
		return listaService.findListaById(id);
	}
	
	@PutMapping("/listas/{id}")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Lista> updateListaById(@PathVariable (value = "id") Long id, @RequestBody Lista lista) {
		log.info("Atualizando por ID os dados na Lista [{}]", id, lista);
		return listaService.updateListaById(lista, id);
	}
	
	@DeleteMapping("/listas/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public ResponseEntity<Object> deleteListaById(@PathVariable (value = "id") Long id) {
		log.info("Apagando por ID os dados na Lista [{}]", id);
		return listaService.deleteById(id);
	}
}











