package com.example.proxibanque.service;

import com.example.proxibanque.entity.CompteCourant;
import com.example.proxibanque.repository.CompteCourantRepository;
import org.springframework.stereotype.Service;

@Service
public class CompteCourantService {

    private final CompteCourantRepository compteCourantRepository;

    public CompteCourantService(CompteCourantRepository compteCourantRepository) {
        this.compteCourantRepository = compteCourantRepository;
    }

    public CompteCourant creerCompteCourant(CompteCourant compte) {
        return compteCourantRepository.save(compte);
    }

    public CompteCourant getCompteParNumero(String numeroCompte) {
        return compteCourantRepository.findByNumeroCompte(numeroCompte);
    }
}