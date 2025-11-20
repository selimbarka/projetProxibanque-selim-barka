package com.example.proxibanque.controller;

import com.example.proxibanque.entity.Client;
import com.example.proxibanque.entity.ConseillerClientele;
import com.example.proxibanque.service.ClientService;
import com.example.proxibanque.service.ConseillerService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TestController {

    private final ClientService clientService;
    private final ConseillerService conseillerService;

    public TestController(ClientService clientService, ConseillerService conseillerService) {
        this.clientService = clientService;
        this.conseillerService = conseillerService;
    }

    @GetMapping("/clients")
    public List<Client> getAllClients() {
        return clientService.getTousLesClients();
    }

    @PostMapping("/clients")
    public Client creerClient(@RequestBody Client client) {
        return clientService.creerClient(client);
    }

    @GetMapping("/conseillers")
    public List<ConseillerClientele> getAllConseillers() {
        return conseillerService.getTousLesConseillers();
    }

    @PostMapping("/conseillers")
    public ConseillerClientele creerConseiller(@RequestBody ConseillerClientele conseiller) {
        return conseillerService.creerConseiller(conseiller);
    }
}