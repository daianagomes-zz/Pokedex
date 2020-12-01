package com.pokemon.Pokedex.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pokemon.Pokedex.model.Types;

@Repository
public interface TypesRepository extends JpaRepository<Types, Long> {
public List<Types> findAllByTypeContainingIgnoreCase (String type);
}
