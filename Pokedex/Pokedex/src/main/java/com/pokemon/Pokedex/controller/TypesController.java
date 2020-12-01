package com.pokemon.Pokedex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pokemon.Pokedex.model.Types;
import com.pokemon.Pokedex.repository.TypesRepository;

import aj.org.objectweb.asm.Type;

@RestController
@RequestMapping("/types")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TypesController {

	@Autowired
	private TypesRepository repository;
	
	@GetMapping("/id/{id}")
	public ResponseEntity<Types> getById(@PathVariable long id)
	{
	return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	@GetMapping("/type/{type}")
	public ResponseEntity <List<Types>> getByType(@PathVariable String type)
	{
	return ResponseEntity.ok(repository.findAllByTypeContainingIgnoreCase(type));
	}
	@PostMapping
	public ResponseEntity<Types> post (@RequestBody Type types)
	{
	 return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(types));
	}
	@PutMapping
	public ResponseEntity<Types> put (@RequestBody Type types)
	{
	 return ResponseEntity.status(HttpStatus.OK).body(repository.save(types));
	}
	@DeleteMapping
	public void delete (@PathVariable long id)
	{
		repository.deleteById(id);
	}
	
}
