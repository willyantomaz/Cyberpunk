package com.projeto.inicial.controller;

import com.projeto.inicial.model.domain.Personagem;
import com.projeto.inicial.model.repository.PersonRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
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


    @PostMapping @Transactional
    public ResponseEntity salvar(@Valid Personagem dados, UriComponentsBuilder builder) {
        var person = new Personagem();
        person = personRepository.save(dados);


        var uri = builder.path("/personagem/{id}").buildAndExpand(person.getId()).toUri();


        return ResponseEntity.created(uri).body(new Personagem(person));
    }

    @GetMapping("/get")
    public ResponseEntity<List<Personagem>> getAll() {
        var lista = personRepository.findAll().stream().map(Personagem::new).toList();
        return ResponseEntity.ok(lista);
    }
}

