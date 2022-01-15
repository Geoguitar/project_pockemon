package com.project.pokemon.service;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.project.pokemon.entity.Lista;
import com.project.pokemon.repository.ListaRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ListaService {
	
	private ListaRepository listaRepository;
	
	public Lista createLista(Lista lista) {

		return listaRepository.save(lista);
	}
	
	public List<Lista> listar() {

		return listaRepository.findAll();
	}
	
	public ResponseEntity<Lista> findListaById(Long id) {
		
		return listaRepository.findById(id)
				.map(taskLista -> ResponseEntity.ok().body(taskLista))
				.orElse(ResponseEntity.notFound().build());
	}
	
	public ResponseEntity<Lista> updateListaById (Lista lista, Long id) {
		
		return listaRepository.findById(id)
				.map(taskUpadate -> {
					taskUpadate.setNome(lista.getNome());
					Lista atualizada = listaRepository.save(taskUpadate);
					return ResponseEntity.ok().body(atualizada);
				}).orElse(ResponseEntity.notFound().build());
	}

	public ResponseEntity<Object> deleteById(Long id) {
		return listaRepository.findById(id)
				.map(taskDelete -> {
					listaRepository.deleteById(id);
					return ResponseEntity.noContent().build();
				}).orElse(ResponseEntity.notFound().build());
	}
}
