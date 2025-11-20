package com.example.proxibanque.service;

import com.example.proxibanque.entity.Client;
import com.example.proxibanque.repository.ClientRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Client creerClient(Client client) {
        return clientRepository.save(client);
    }

    public List<Client> getTousLesClients() {
        return clientRepository.findAll();
    }

    public Client getClientParId(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    public void supprimerClient(Long id) {
        clientRepository.deleteById(id);
    }
}