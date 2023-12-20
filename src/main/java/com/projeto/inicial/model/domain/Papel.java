package com.projeto.inicial.model.domain;


import lombok.Getter;

@Getter
public enum Papel {
    SOLO("Solo"),
    ROQUEIRO("Roqueiro"),
    NETRUNNER("Netrunner"),
    TECNICO("Tecnico"),
    NOMADE("Nomade"),
    ATRAVESSADOR("Atravessador"),
    POLICIA("Policia"),
    EXECUTIVO("Executivo"),
    MIDIA("Midia"),
    TECNOMEDICO("Tecnico_Medico");

    private final String displayValue;
    Papel(String displayValue) {
        this.displayValue = displayValue;
    }
}
