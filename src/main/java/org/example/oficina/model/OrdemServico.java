package org.example.oficina.model;

import jakarta.persistence.Entity;

@Entity
public class OrdemServico {

    private Long idOrdemServico;

    private String descricaoProblema;

    private String status;

    private Double valorServico;

}
