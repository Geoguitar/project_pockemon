package com.project.pokemon.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.pokemon.entity.Lista;

@RestController
@RequestMapping("/pokemonView")
public class PokemonController {
	
	@GetMapping
	public List<Lista> listar() {
		return null;
		
	}

}
