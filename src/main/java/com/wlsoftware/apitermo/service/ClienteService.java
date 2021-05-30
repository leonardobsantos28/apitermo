package com.wlsoftware.apitermo.service;

import com.wlsoftware.apitermo.exceptions.BusinessException;
import com.wlsoftware.apitermo.mapper.ClienteMapper;
import com.wlsoftware.apitermo.model.Cliente;
import com.wlsoftware.apitermo.model.dto.ClienteDTO;
import com.wlsoftware.apitermo.repository.ClienteRepository;
import com.wlsoftware.apitermo.util.MessageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    @Autowired
    private ClienteMapper mapper;

    @Transactional
    public ClienteDTO save(ClienteDTO dto) {
        Optional<Cliente> optionalCliente = repository.findByNome(dto.getNome());
        if(optionalCliente.isPresent()){
            throw new BusinessException(MessageUtils.CLIENTE_EXISTE);
        }
        Cliente cliente= mapper.toEntity(dto);
        repository.save(cliente);
        return mapper.toDto(cliente);
    }

}
