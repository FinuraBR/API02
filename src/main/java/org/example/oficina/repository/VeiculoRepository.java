package org.example.oficina.repository;

import org.example.oficina.model.Veiculo;
import org.jspecify.annotations.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VeiculoRepository extends JpaRepository<Veiculo,Long> {
    Veiculo save(@NonNull Veiculo veiculo);

    List<Veiculo> findByPlacaContainingIgnoreCase(String placa);

    List<Veiculo> findByClienteIdCliente(String cliente);

}
