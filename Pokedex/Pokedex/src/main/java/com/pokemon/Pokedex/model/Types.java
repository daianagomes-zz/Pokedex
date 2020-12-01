package com.pokemon.Pokedex.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_types")
public class Types {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;

@NotNull
@Size (max = 36)
private String type;

@OneToMany (mappedBy = "types", cascade = CascadeType.ALL)
@JsonIgnoreProperties("types")
private List<Pokemon> pokemon;


public List<Pokemon> getPokemon() {
	return pokemon;
}

public void setPokemon(List<Pokemon> pokemon) {
	this.pokemon = pokemon;
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

}
