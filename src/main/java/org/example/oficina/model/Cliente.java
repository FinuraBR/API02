package org.example.oficina.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Getter
    @Setter
    private Long idCliente;

    @Getter
    @Setter
    private String nome;

    @Getter
    @Setter
    private String telefone;

    @Getter
    @Setter
    private String email;

    public Cliente(){}
}
