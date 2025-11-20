package com.example.proxibanque.mapper;

import com.example.proxibanque.dto.ConseillerDto;
import com.example.proxibanque.entity.ConseillerClientele;
import org.springframework.stereotype.Component;

@Component
public class ConseillerMapper {

    public ConseillerDto toDto(ConseillerClientele conseiller) {
        if (conseiller == null) {
            return null;
        }
        return new ConseillerDto(
                conseiller.getId(),
                conseiller.getNom(),
                conseiller.getPrenom()
        );
    }

    public ConseillerClientele toEntity(ConseillerDto dto) {
        if (dto == null) {
            return null;
        }
        return new ConseillerClientele(dto.nom(), dto.prenom());
    }
}