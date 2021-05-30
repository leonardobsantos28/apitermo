package com.wlsoftware.apitermo.repository;

import com.wlsoftware.apitermo.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {


    Optional<Cliente> findByNome(String nome);
}
