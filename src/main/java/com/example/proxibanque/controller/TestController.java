package com.example.proxibanque.controller;

import com.example.proxibanque.dto.ClientDto;
import com.example.proxibanque.dto.ConseillerDto;
import com.example.proxibanque.entity.Client;
import com.example.proxibanque.entity.ConseillerClientele;
import com.example.proxibanque.mapper.ClientMapper;
import com.example.proxibanque.mapper.ConseillerMapper;
import com.example.proxibanque.service.ClientService;
import com.example.proxibanque.service.ConseillerService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class TestController {

    private final ClientService clientService;
    private final ConseillerService conseillerService;
    private final ClientMapper clientMapper;
    private final ConseillerMapper conseillerMapper;

    public TestController(ClientService clientService,
                          ConseillerService conseillerService,
                          ClientMapper clientMapper,
                          ConseillerMapper conseillerMapper) {
        this.clientService = clientService;
        this.conseillerService = conseillerService;
        this.clientMapper = clientMapper;
        this.conseillerMapper = conseillerMapper;
    }

    @GetMapping("/clients")
    public List<ClientDto> getAllClients() {
        return clientService.getTousLesClients()
                .stream()
                .map(clientMapper::toDto)
                .collect(Collectors.toList());
    }

    @PostMapping("/clients")
    public ClientDto creerClient(@Valid @RequestBody ClientDto clientDto) {
        Client client = clientMapper.toEntity(clientDto);
        Client clientCree = clientService.creerClient(client);
        return clientMapper.toDto(clientCree);
    }

    @GetMapping("/conseillers")
    public List<ConseillerDto> getAllConseillers() {
        return conseillerService.getTousLesConseillers()
                .stream()
                .map(conseillerMapper::toDto)
                .collect(Collectors.toList());
    }

    @PostMapping("/conseillers")
    public ConseillerDto creerConseiller(@Valid @RequestBody ConseillerDto conseillerDto) {
        ConseillerClientele conseiller = conseillerMapper.toEntity(conseillerDto);
        ConseillerClientele conseillerCree = conseillerService.creerConseiller(conseiller);
        return conseillerMapper.toDto(conseillerCree);
    }
}