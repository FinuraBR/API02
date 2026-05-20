package org.example.oficina.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.example.oficina.dto.VeiculoRequestDTO;
import org.example.oficina.dto.VeiculoResponseDTO;
import org.example.oficina.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Veículos", description = "Rotas para gerenciamento de veículos")
@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

    @Autowired
    private VeiculoService service;

    @Operation(summary = "Lista todos os veículos")
    @GetMapping
    public List<VeiculoResponseDTO> listar() {
        return service.listarTodos();
    }

    @Operation(summary = "Busca um veículo por id")
    @GetMapping("/{idVeiculo}")
    public VeiculoResponseDTO buscarPorId(@PathVariable Long idVeiculo) {
        return service.buscarPorId(idVeiculo);
    }

    @Operation(summary = "Cadastra um novo veículo")
    @PostMapping
    public VeiculoResponseDTO cadastrar(@Valid @RequestBody VeiculoRequestDTO dto, Long ClienteId) {
        return service.cadastrar(dto, ClienteId);
    }

    @Operation(summary = "Atualiza um veículo existente")
    @PutMapping("/{idVeiculo}")
    public VeiculoResponseDTO atualizar(@PathVariable Long idVeiculo, @RequestBody VeiculoRequestDTO dto) {
        return service.atualizar(dto, idVeiculo);
    }

    @Operation(summary = "Remove um veículo")
    @DeleteMapping("/{idVeiculo}")
    public void deletar(@PathVariable Long idVeiculo) {
        service.deletar(idVeiculo);
    }

    @Operation(summary = "Filtra veículos pela placa")
    @GetMapping("/buscarporplaca")
    public List<VeiculoResponseDTO> filtrarPorPlaca(@RequestParam String placa) {
        return service.filtrarPorPlaca(placa);
    }

    @Operation(summary = "Lista veículos de um determinado cliente")
    @GetMapping("/{idCliente}")
    public List<VeiculoResponseDTO> listarPorCliente(@PathVariable Long idCliente) {
        return service.listarPorCliente(idCliente);
    }
}
