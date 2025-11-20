package com.example.proxibanque.service;

import com.example.proxibanque.entity.ConseillerClientele;
import com.example.proxibanque.repository.ConseillerClienteleRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ConseillerService {

    private final ConseillerClienteleRepository conseillerRepository;

    public ConseillerService(ConseillerClienteleRepository conseillerRepository) {
        this.conseillerRepository = conseillerRepository;
    }

    public ConseillerClientele creerConseiller(ConseillerClientele conseiller) {
        return conseillerRepository.save(conseiller);
    }

    public List<ConseillerClientele> getTousLesConseillers() {
        return conseillerRepository.findAll();
    }

    public ConseillerClientele getConseillerParId(Long id) {
        return conseillerRepository.findById(id).orElse(null);
    }
}