package com.example.proxibanque.repository;

import com.example.proxibanque.Entity.CompteCourant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteCourantRepository extends JpaRepository<CompteCourant, Long> {

    CompteCourant findByNumeroCompte(String numeroCompte);
}