package com.example.proxibanque.Entity;

import jakarta.persistence.Entity;

@Entity
public class CompteCourant extends CompteBancaire {

    private Double decouvertAutorise = 1000.0;

    public CompteCourant() {
    }

    public Double getDecouvertAutorise() {
        return decouvertAutorise;
    }

    public void setDecouvertAutorise(Double decouvertAutorise) {
        this.decouvertAutorise = decouvertAutorise;
    }
}