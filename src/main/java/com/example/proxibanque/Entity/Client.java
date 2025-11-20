package com.example.proxibanque.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Le nom ne peut pas être vide")
    private String nom;

    @NotBlank(message = "Le prénom ne peut pas être vide")
    private String prenom;

    private String adresse;
    private String codePostal;
    private String ville;
    private String telephone;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private CompteCourant compteCourant;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private CompteEpargne compteEpargne;

    @ManyToOne
    @JoinColumn(name = "conseiller_id")
    private ConseillerClientele conseiller;


    public Client() {
    }

    public Client(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public CompteCourant getCompteCourant() {
        return compteCourant;
    }

    public void setCompteCourant(CompteCourant compteCourant) {
        this.compteCourant = compteCourant;
    }

    public CompteEpargne getCompteEpargne() {
        return compteEpargne;
    }

    public void setCompteEpargne(CompteEpargne compteEpargne) {
        this.compteEpargne = compteEpargne;
    }

    public ConseillerClientele getConseiller() {
        return conseiller;
    }

    public void setConseiller(ConseillerClientele conseiller) {
        this.conseiller = conseiller;
    }
}