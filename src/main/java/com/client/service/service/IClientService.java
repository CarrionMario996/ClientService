package com.client.service.service;

import com.client.service.model.dto.ClientDto;

import java.util.List;

public interface IClientService {
    public List<ClientDto> findAllClient();
}
