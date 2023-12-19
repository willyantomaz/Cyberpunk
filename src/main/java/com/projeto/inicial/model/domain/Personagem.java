package com.projeto.inicial.model.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity(name = "Personagem")
@Table(name = "personagem")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Personagem {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nome;

    @NotNull
    private Integer pontos;


    @Enumerated(EnumType.STRING)
    private Papel papel;


    private String desenhoPers;

    public Personagem(DadosPersonagem dados) {
        this.nome = dados.getNome();
        this.pontos = dados.getPontos();
        this.papel = dados.getPapel();
        this.desenhoPers = dados.getDesenhoPers();
    }
}
