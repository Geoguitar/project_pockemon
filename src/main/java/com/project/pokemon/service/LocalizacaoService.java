package com.project.pokemon.service;

import java.util.List;
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
	
}
