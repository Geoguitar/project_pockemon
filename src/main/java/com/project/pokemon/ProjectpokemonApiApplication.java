package com.project.pokemon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.project.pokemon.entity.Lista;
import com.project.pokemon.repository.ListaRepository;

@SpringBootApplication
public class ProjectpokemonApiApplication implements CommandLineRunner {

	@Autowired
	private ListaRepository listaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ProjectpokemonApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//Lista l1 = new Lista(null, "Bulbasaur", null);
		Lista l1 = new Lista();
		listaRepository.save(l1);
	}
	
	

}
