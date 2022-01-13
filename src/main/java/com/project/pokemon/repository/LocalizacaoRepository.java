package com.project.pokemon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.pokemon.entity.Localizacao;

public interface LocalizacaoRepository extends JpaRepository<Localizacao, Long> {

}
