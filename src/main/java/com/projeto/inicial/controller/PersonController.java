package com.projeto.inicial.controller;

import com.projeto.inicial.model.domain.DadosPersonagem;
import com.projeto.inicial.model.domain.Personagem;
import com.projeto.inicial.model.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;


@RestController
@RequestMapping("/personagem")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @PostMapping
    public ResponseEntity salvar(DadosPersonagem dados, UriComponentsBuilder builder) {
        var person = new Personagem(dados);
        personRepository.save(person);


        var uri = builder.path("/personagem/{id}").buildAndExpand(person.getId()).toUri();


        return ResponseEntity.created(uri).body(new DadosPersonagem(person));
    }

    @GetMapping
    public ResponseEntity<List<DadosPersonagem>> getAll(){
        var lista =personRepository.findAll().stream().map(DadosPersonagem::new).toList();
       return ResponseEntity.ok(lista);
    }
}
