package com.example.proxibanque.service;

import com.example.proxibanque.entity.CompteEpargne;
import com.example.proxibanque.repository.CompteEpargneRepository;
import org.springframework.stereotype.Service;

@Service
public class CompteEpargneService {

    private final CompteEpargneRepository compteEpargneRepository;

    public CompteEpargneService(CompteEpargneRepository compteEpargneRepository) {
        this.compteEpargneRepository = compteEpargneRepository;
    }

    public CompteEpargne creerCompteEpargne(CompteEpargne compte) {
        return compteEpargneRepository.save(compte);
    }

    public CompteEpargne getCompteParNumero(String numeroCompte) {
        return compteEpargneRepository.findByNumeroCompte(numeroCompte);
    }
}