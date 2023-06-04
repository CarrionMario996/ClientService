package com.client.service.repository;

import com.client.service.model.dto.ClientDto;
import com.client.service.model.entity.Client;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClientRepository extends CrudRepository<Client,Long> {

    @Query(value = "select new com.client.service.model.dto.ClientDto(c.id,c.firstName,c.lastName,c.document,c.phone,c.address,c.email)  from Client c")
    public List<ClientDto> findAllClients();
}
