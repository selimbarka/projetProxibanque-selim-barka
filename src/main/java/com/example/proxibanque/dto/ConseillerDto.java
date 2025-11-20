package com.example.proxibanque.dto;

import jakarta.validation.constraints.NotBlank;

public record ConseillerDto(
        Long id,

        @NotBlank(message = "Le nom ne peut pas être vide")
        String nom,

        @NotBlank(message = "Le prénom ne peut pas être vide")
        String prenom
) {}