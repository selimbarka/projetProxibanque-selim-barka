package com.example.proxibanque.mapper;

import com.example.proxibanque.dto.ClientDto;
import com.example.proxibanque.entity.Client;
import org.springframework.stereotype.Component;

@Component
public class ClientMapper {

    public ClientDto toDto(Client client) {
        if (client == null) {
            return null;
        }
        return new ClientDto(
                client.getId(),
                client.getNom(),
                client.getPrenom(),
                client.getAdresse(),
                client.getCodePostal(),
                client.getVille(),
                client.getTelephone()
        );
    }

    public Client toEntity(ClientDto dto) {
        if (dto == null) {
            return null;
        }
        Client client = new Client(dto.nom(), dto.prenom());
        client.setAdresse(dto.adresse());
        client.setCodePostal(dto.codePostal());
        client.setVille(dto.ville());
        client.setTelephone(dto.telephone());
        return client;
    }
}