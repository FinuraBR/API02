package org.example.oficina.repository;

import org.example.oficina.model.Veiculo;

import java.util.List;

public interface OrdemServicoRepository {

    //TODO: criar método para listar ordens de serviço de um determinado veículo.

    List<Veiculo> findByidVeiculoContainingIgnoreCase(String idVeiculo);
}