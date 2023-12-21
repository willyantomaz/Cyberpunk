package com.projeto.inicial.model.domain;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@NotNull
public class Atributos {
    private Integer inteligencia;
    private Integer reflexo;
    private Integer habilidade_tecnica;
    private Integer autocontrole;
    private Integer atratividade;
    private Integer sorte;
    private Integer capacidade_de_movimento;
    private Integer tipo_corporal;
    private Integer empatia;


}
