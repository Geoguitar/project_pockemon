<<<<<<< HEAD
package com.project.pokemon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.project.pokemon.entity.Lista;
import com.project.pokemon.service.PokemonService;

@RestController
@RequestMapping("/api/v1")
public class PokemonController {
	
	@Autowired
	PokemonService listaService;
	
	@PostMapping("/listas")
	@ResponseStatus(HttpStatus.CREATED)
	public Lista createLista (@RequestBody Lista lista) {
		return listaService.createLista(lista);
	}
	

}
=======
package com.project.pokemon.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class PokemonController {

}
>>>>>>> 99f8b2113612007cea0ee7aa090856cd3caeccc9
