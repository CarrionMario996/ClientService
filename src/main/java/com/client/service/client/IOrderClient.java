package com.client.service.client;

import com.client.service.model.dto.OrderDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(url="${order-api.path}",name="OrderApi")
public interface IOrderClient {

    @GetMapping("/api/v1.0.0/order/client/{clientId}")
    List<OrderDto>findByClientId(@PathVariable Long clientId);
}
