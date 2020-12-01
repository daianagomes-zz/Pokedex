package com.pokemon.Pokedex.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pokemon.Pokedex.model.Pokemon;

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Long> {
public List<Pokemon> findAllByNameContainingIgnoreCase (String name);
}
