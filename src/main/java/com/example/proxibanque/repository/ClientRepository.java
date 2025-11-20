package com.example.proxibanque.repository;

import com.example.proxibanque.Entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    List<Client> findByNom(String nom);

    List<Client> findByConseillerId(Long conseillerId);
}