package com.projeto.inicial.model.domain;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity(name = "Personagem")
@Table(name = "personagem")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
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

    @Embedded @Valid @NotNull
    private Atributos atributos;

    public Personagem(Personagem personagem) {
        this(personagem.getId(), personagem.getNome(),
                personagem.getPontos(),personagem.getPapel(),
                personagem.getDesenhoPers(),personagem.getAtributos());
    }

}
