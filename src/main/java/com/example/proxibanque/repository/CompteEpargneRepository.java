package com.example.proxibanque.repository;

import com.example.proxibanque.Entity.CompteEpargne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteEpargneRepository extends JpaRepository<CompteEpargne, Long> {

    CompteEpargne findByNumeroCompte(String numeroCompte);
}