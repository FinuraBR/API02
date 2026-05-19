package org.example.oficina.dto;

public record VeiculoRequestDTO(

        //TODO: colocar validações de entrada de dados
        String placa,

        String modelo,

        Integer ano,

        Long clienteId
) {
}
