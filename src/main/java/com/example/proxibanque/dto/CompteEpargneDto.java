package com.example.proxibanque.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;

public record CompteEpargneDto(
        Long id,

        @NotBlank(message = "Le numéro de compte ne peut pas être vide")
        String numeroCompte,

        @Min(value = 0, message = "Le solde doit être positif")
        Double solde,

        @Min(value = 0, message = "Le taux doit être positif")
        @Max(value = 100, message = "Le taux doit être inférieur à 100")
        Double tauxRemuneration
) {}