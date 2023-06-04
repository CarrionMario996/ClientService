package com.client.service.service;

import com.client.service.model.dto.ClientDto;

import javax.swing.text.html.Option;
import java.util.List;

public interface IClientService {
    public List<ClientDto> findAllClient();
}
