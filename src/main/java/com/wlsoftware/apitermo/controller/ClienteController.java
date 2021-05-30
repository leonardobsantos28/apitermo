package com.wlsoftware.apitermo.controller;

import com.wlsoftware.apitermo.model.Cliente;
import com.wlsoftware.apitermo.model.dto.ClienteDTO;
import com.wlsoftware.apitermo.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/cliente")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ClienteDTO> save(@Valid @RequestBody ClienteDTO dto){
        return ResponseEntity.ok(service.save(dto));
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ClienteDTO>> findAll(){
        List<ClienteDTO> list = new ArrayList<>();
        ClienteDTO dto = new ClienteDTO();
        dto.setCep("15670000");
        dto.setIdCliente(5);
        dto.setCnpj("10.496.794/000180");
        dto.setEndereco("Rua São Paulo 1277");
        dto.setNome("Prefeitura Populina");
        list.add(dto);
        return ResponseEntity.ok(list);
    }

}
