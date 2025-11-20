package com.example.proxibanque.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import java.time.LocalDate;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class CompteBancaire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Le numéro de compte ne peut pas être vide")
    private String numeroCompte;

    private Double solde;
    private LocalDate dateOuverture;

    public CompteBancaire() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public Double getSolde() {
        return solde;
    }

    public void setSolde(Double solde) {
        this.solde = solde;
    }

    public LocalDate getDateOuverture() {
        return dateOuverture;
    }

    public void setDateOuverture(LocalDate dateOuverture) {
        this.dateOuverture = dateOuverture;
    }
}