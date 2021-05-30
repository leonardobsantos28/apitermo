package com.wlsoftware.apitermo.mapper;

import com.wlsoftware.apitermo.model.Cliente;
import com.wlsoftware.apitermo.model.dto.ClienteDTO;
import org.springframework.stereotype.Component;

@Component
public class ClienteMapper  {


    public Cliente toEntity(ClienteDTO dto) {
        Cliente cliente = new Cliente();
        cliente.setIdCliente(dto.getIdCliente());
        cliente.setCep(dto.getCep());
        cliente.setCnpj(dto.getCnpj());
        cliente.setEndereco(dto.getEndereco());
        cliente.setNome(dto.getNome());
        return cliente;
    }


    public ClienteDTO toDto(Cliente cliente) {
        ClienteDTO clienteDTO = new ClienteDTO();
        clienteDTO.setIdCliente(cliente.getIdCliente());
        clienteDTO.setCep(cliente.getCep());
        clienteDTO.setCnpj(cliente.getCnpj());
        clienteDTO.setEndereco(cliente.getEndereco());
        clienteDTO.setNome(cliente.getNome());
        return clienteDTO;
    }
}
