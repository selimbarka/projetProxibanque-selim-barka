package com.example.proxibanque.entity;

import jakarta.persistence.Entity;

@Entity
public class CompteEpargne extends CompteBancaire {

    private Double tauxRemuneration = 3.0;

    public CompteEpargne() {
    }

    public Double getTauxRemuneration() {
        return tauxRemuneration;
    }

    public void setTauxRemuneration(Double tauxRemuneration) {
        this.tauxRemuneration = tauxRemuneration;
    }
}