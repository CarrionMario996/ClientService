package com.client.service.controller;

import com.client.service.model.dto.ClientDto;
import com.client.service.service.ClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1.0.0/client")
public class ClientController {
    @Autowired
    private ClientServiceImpl service;


    @GetMapping
    public List<ClientDto> findAllClient(){
        return service.findAllClient();
    }

}
