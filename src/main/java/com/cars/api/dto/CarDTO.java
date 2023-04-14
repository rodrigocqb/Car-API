package com.cars.api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;

public record CarDTO(
    @NotBlank
    String modelo, 
    
    @NotBlank
    String fabricante, 

    @NotBlank
    @Past
    String dataFabricacao,

    @NotBlank
    int valor, 

    @NotBlank
    int anoModelo
    ) {

}
