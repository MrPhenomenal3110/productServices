package org.premshah.productservices.Utils;

import org.premshah.productservices.DTOs.ExceptionDTO;
import org.premshah.productservices.Exceptions.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptions {
    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<ExceptionDTO> handleProductNotFoundException(ProductNotFoundException e) {
        ExceptionDTO productNotFoundExceptionDTO = new ExceptionDTO();
        productNotFoundExceptionDTO.setMessage(e.getMessage());
        productNotFoundExceptionDTO.setResolution("ProductNotFoundException : Please check the product id and try again");
        return new ResponseEntity<>(productNotFoundExceptionDTO, HttpStatus.BAD_REQUEST);
    }
}
