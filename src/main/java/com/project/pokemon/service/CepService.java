package com.project.pokemon.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.project.pokemon.entity.Cep;
import com.project.pokemon.repository.CepRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CepService {
	
	private CepRepository cepRepository;
	
	public Cep createCep(Cep cep) {

		return cepRepository.save(cep);
	}
	
	public List<Cep> listarCep(){
		
		return cepRepository.findAll();
	}

	public ResponseEntity<Cep> findCepById (Long id){
		
		return cepRepository.findById(id)
				.map(taskCep -> ResponseEntity.ok().body(taskCep))
				.orElse(ResponseEntity.notFound().build());
	}
}
