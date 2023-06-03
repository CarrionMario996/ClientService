package com.client.service.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderDto {
   private String orderId;
   private String country;
   private String total;
   private String status;

}
