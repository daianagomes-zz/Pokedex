package com.pokemon.Pokedex.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_pokemon")
public class Pokemon {

@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
private long id;

@NotNull
private int pokedex_index;

@NotNull
@Size(max = 36)
private String name;

@NotNull
@Min(1)
@Max(255)
private int hp;

@NotNull
@Min(5)
@Max(190)
private int attack;

@NotNull
@Min(5)
@Max(230)
private int defense;

@NotNull
@Min(10)
@Max(194)
private int special_attack;

@NotNull
@Min(20)
@Max(230)
private int special_defense;

@NotNull
@Min(5)
@Max(180)
private int speed;

@NotNull
@Min(1)
@Max(6)
private int generation;

@ManyToOne
@JsonIgnoreProperties("pokemon")
private Types types;

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public int getPokedex_index() {
	return pokedex_index;
}

public void setPokedex_index(int pokedex_index) {
	this.pokedex_index = pokedex_index;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getHp() {
	return hp;
}

public void setHp(int hp) {
	this.hp = hp;
}

public int getAttack() {
	return attack;
}

public void setAttack(int attack) {
	this.attack = attack;
}

public int getDefense() {
	return defense;
}

public void setDefense(int defense) {
	this.defense = defense;
}

public int getSpecial_attack() {
	return special_attack;
}

public void setSpecial_attack(int special_attack) {
	this.special_attack = special_attack;
}

public int getSpecial_defense() {
	return special_defense;
}

public void setSpecial_defense(int special_defense) {
	this.special_defense = special_defense;
}

public int getSpeed() {
	return speed;
}

public void setSpeed(int speed) {
	this.speed = speed;
}

public int getGeneration() {
	return generation;
}

public void setGeneration(int generation) {
	this.generation = generation;
}

}
