package com.client.service.service;

import com.client.service.client.IOrderClient;
import com.client.service.model.dto.ClientDto;
import com.client.service.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements IClientService{

    @Autowired
    private ClientRepository repository;

    @Autowired
    private IOrderClient client;

    @Override
    public List<ClientDto>findAllClient(){
        List<ClientDto>resultado= repository.findAllClients();
        if(!resultado.isEmpty()){
            for(ClientDto clientDto : resultado){
               clientDto.setOrders(client.findByClientId(clientDto.getId()));
            }

        }
        return resultado;
    }
}
