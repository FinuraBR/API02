package org.example.oficina.model;

import jakarta.persistence.*;

@Entity
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVeiculo;

    private String placa;

    private String modelo;

    private Integer ano;

    //TODO: corrigir o relacionamento entre Veiculo e Cliente
    private Long clienteId;

}
