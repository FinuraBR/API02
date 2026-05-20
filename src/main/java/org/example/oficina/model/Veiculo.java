package org.example.oficina.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Veiculo {

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVeiculo;

    @Setter
    @Getter
    private String email;

    @Setter
    @Getter
    private String telefone;

    @Setter
    @Getter
    private String nome;

    @Getter
    @Setter
    private String placa;

    @Getter
    @Setter
    private String modelo;

    @Getter
    @Setter
    private Integer ano;

    @OneToMany
    @Getter
    @Setter
    private Long clienteId;
}
