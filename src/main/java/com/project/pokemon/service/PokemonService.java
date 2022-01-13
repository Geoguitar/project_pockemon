package com.project.pokemon.service;

import org.springframework.beans.factory.annotation.Autowired;
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

	public Cep createLista(Cep cep) {

		return cepRepository.save(cep);
	}

	public Localizacao createLocalizacao(Localizacao localizacao) {

		return localizacaoRepository.save(localizacao);
	}
	
	
}
