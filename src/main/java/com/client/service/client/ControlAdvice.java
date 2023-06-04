package com.client.service.client;

import com.client.service.exception.RequestException;
import com.client.service.model.dto.ErrorDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControlAdvice {
    @ExceptionHandler(value= RequestException.class)
    public ResponseEntity<ErrorDto> runtimeExceptionHandler(RequestException ex){
        ErrorDto error=ErrorDto.builder().message(ex.getMessage()).build();
        return new ResponseEntity<>(error, ex.getStatus());
    }
}
