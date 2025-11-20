package com.example.proxibanque.repository;

import com.example.proxibanque.Entity.ConseillerClientele;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ConseillerClienteleRepository extends JpaRepository<ConseillerClientele, Long> {

    List<ConseillerClientele> findByNom(String nom);
}