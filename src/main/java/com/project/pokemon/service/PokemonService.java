package com.project.pokemon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.project.pokemon.entity.Cep;
import com.project.pokemon.entity.Lista;
import com.project.pokemon.entity.Localizacao;
import com.project.pokemon.repository.CepRepository;
import com.project.pokemon.repository.ListaRepository;
import com.project.pokemon.repository.LocalizacaoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PokemonService {
	
	@Autowired
	private ListaRepository listaRepository;
	
	@Autowired
	private LocalizacaoRepository localizacaoRepository;
	
	@Autowired
	private CepRepository cepRepository;
	
	
	
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
	
	
	
	public Cep createLista(Cep cep) {

		return cepRepository.save(cep);
	}

	public Localizacao createLocalizacao(Localizacao localizacao) {

		return localizacaoRepository.save(localizacao);
	}
	
}
