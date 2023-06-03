package com.client.service.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;




@Getter
@Setter
public class ClientDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String document;
    private String phone;
    private String address;
    private String email;
    private List<OrderDto> orders;

    public ClientDto(Long id, String firstName, String lastName, String document, String phone, String address, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.document = document;
        this.phone = phone;
        this.address = address;
        this.email = email;
    }
}
