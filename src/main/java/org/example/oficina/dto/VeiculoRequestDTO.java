package org.example.oficina.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record VeiculoRequestDTO(

        @NotNull
        @NotBlank
        String placa,

        @NotNull
        @NotBlank
        String modelo,

        @NotNull
        @Positive
        Integer ano,

        Long clienteId
) {
}
