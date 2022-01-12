package com.project.pokemon.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_localizacao" )
public class Localizacao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String cep;
	private String pokemon;
	
	@ManyToOne
	@JoinColumn(name = "cep_id")
	private Cep cep_id;
	
	public Localizacao () {
	}
	
	public Localizacao (String pokemon) {
		super();
		this.pokemon = pokemon;
	}
	
	public Localizacao (String cep, String pokemon) {
		super();
		this.cep = cep;
		this.pokemon = pokemon;
	}
	
	public Localizacao (Long id, String cep, String pokemon) {
		super();
		this.id = id;
		this.cep = cep;
		this.pokemon = pokemon;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getPokemon() {
		return pokemon;
	}

	public void setPokemon(String pokemon) {
		this.pokemon = pokemon;
	}
	
}
