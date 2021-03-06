package com.project.pokemon.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.project.pokemon.entity.Localizacao;
import com.project.pokemon.repository.LocalizacaoRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LocalizacaoService {

	private LocalizacaoRepository localizacaoRepository;
	
	
	public Localizacao createLocalizacao(Localizacao localizacao) {

		return localizacaoRepository.save(localizacao);
	}
	
	public List<Localizacao> listLocalizacao(){
		
		return localizacaoRepository.findAll();
	}
	
	public ResponseEntity<Localizacao> findLocalizacaoById (Long id){
		
		return localizacaoRepository.findById(id)
				.map(taskLocalizacao -> ResponseEntity.ok().body(taskLocalizacao))
				.orElse(ResponseEntity.notFound().build());
	}
	
	public ResponseEntity<Localizacao> updateLocalizacaoById (Localizacao localizacao, Long id){
		
		return localizacaoRepository.findById(id)
		.map(taskUpdate ->{
			taskUpdate.setPokemon(localizacao.getPokemon());
			taskUpdate.setCep(localizacao.getCep());
			Localizacao updated = localizacaoRepository.save(taskUpdate);
			return ResponseEntity.ok().body(updated);			
		}).orElse(ResponseEntity.notFound().build());
	}
	
	public ResponseEntity<Object> deleteById (Long id){
		
		return localizacaoRepository.findById(id)
				.map(taskDelete -> {
					localizacaoRepository.deleteById(id);
					return ResponseEntity.noContent().build();
				}).orElse(ResponseEntity.notFound().build());
	}
	
}










