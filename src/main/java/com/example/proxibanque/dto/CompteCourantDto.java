package com.example.proxibanque.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public record CompteCourantDto(
        Long id,

        @NotBlank(message = "Le numéro de compte ne peut pas être vide")
        String numeroCompte,

        @Min(value = 0, message = "Le solde doit être positif")
        Double solde,

        Double decouvertAutorise
) {}