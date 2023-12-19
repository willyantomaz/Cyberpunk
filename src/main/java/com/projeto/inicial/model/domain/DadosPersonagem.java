package com.projeto.inicial.model.domain;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DadosPersonagem {
    private Long id;
    private String nome;
    private Integer pontos;
    private String desenhoPers;
    @NotNull
    private Papel papel;


    public DadosPersonagem(Personagem person) {
        this.id = person.getId();
        this.nome = person.getNome();
        this.pontos = person.getPontos();
        this.desenhoPers = person.getDesenhoPers();
        this.papel = person.getPapel();
    }


}
