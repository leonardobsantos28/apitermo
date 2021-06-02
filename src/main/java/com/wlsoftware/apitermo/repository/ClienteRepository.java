package com.wlsoftware.apitermo.repository;

import com.wlsoftware.apitermo.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {


    Optional<Cliente> findByNome(String nome);


    @Query("SELECT cliente " +
            " FROM Cliente cliente " +
            " WHERE (cliente.nome = :nome " +
            " and cliente.cpfCnpj = :cpfcnpj )" +
            " AND cliente.idCliente <> :idcliente ")
    Optional<Cliente> findByClienteUpdate(String nome,String cpfcnpj,Integer idcliente);



}
