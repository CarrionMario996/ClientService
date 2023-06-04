package com.client.service.controller;

import com.client.service.exception.RequestException;
import com.client.service.model.dto.ClientDto;
import com.client.service.service.ClientServiceImpl;
import org.bouncycastle.cert.ocsp.Req;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1.0.0/client")
public class ClientController {
    @Autowired
    private ClientServiceImpl service;


    @GetMapping("/all")
    public ResponseEntity<?> findAllClient(){
        List<ClientDto> resultado;
        try {
            resultado=service.findAllClient();
        }catch (Exception e){
            throw  new RequestException(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return ResponseEntity.ok(resultado);
    }

}
