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

@CrossOrigin
@RestController
@RequestMapping(value = "/cliente")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ClienteDTO> save(@Valid @RequestBody ClienteDTO dto){
        return ResponseEntity.ok(service.save(dto));
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ClienteDTO> update(@RequestBody ClienteDTO dto){
        return ResponseEntity.ok(service.update(dto));
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ClienteDTO>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping(value = "/{idCliente}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ClienteDTO> findById(@PathVariable Integer idCliente){
        return ResponseEntity.ok(service.findById(idCliente));
    }


}
