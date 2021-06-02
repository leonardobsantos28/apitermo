package com.wlsoftware.apitermo.mapper;

import com.wlsoftware.apitermo.model.Cliente;
import com.wlsoftware.apitermo.model.dto.ClienteDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ClienteMapper  {


    public Cliente toEntity(ClienteDTO dto) {
        Cliente cliente = new Cliente();
        cliente.setIdCliente(dto.getIdCliente());
        cliente.setNome(dto.getNome());
        cliente.setTelefone(dto.getTelefone());
        cliente.setCpfCnpj(dto.getCpfCnpj());
        cliente.setEndereco(dto.getEndereco());
        cliente.setNumero((dto.getNumero()));
        cliente.setBairro((dto.getBairro()));
        cliente.setCep(dto.getCep());
        cliente.setMunicipio(dto.getMunicipio());
        cliente.setEstado(dto.getEstado());
        return cliente;
    }


    public ClienteDTO toDto(Cliente cliente) {
        ClienteDTO clienteDTO = new ClienteDTO();
        clienteDTO.setIdCliente(cliente.getIdCliente());
        clienteDTO.setNome(cliente.getNome());
        clienteDTO.setTelefone(cliente.getTelefone());
        clienteDTO.setCpfCnpj(cliente.getCpfCnpj());
        clienteDTO.setEndereco(cliente.getEndereco());
        clienteDTO.setNumero((cliente.getNumero()));
        clienteDTO.setBairro((cliente.getBairro()));
        clienteDTO.setCep(cliente.getCep());
        clienteDTO.setMunicipio(cliente.getMunicipio());
        clienteDTO.setEstado(cliente.getEstado());
        return clienteDTO;
    }

    public List<ClienteDTO> toDto(List<Cliente> listCliente){
        return listCliente.stream().map(this::toDto).collect(Collectors.toList());
    }

}
