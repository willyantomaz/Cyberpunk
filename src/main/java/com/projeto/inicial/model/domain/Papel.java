package com.projeto.inicial.model.domain;



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
    public String getDisplayValue() {
        return displayValue;
    }
}
