package com.webservice.springwebservice.services;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import java.util.HashMap;
import java.util.Map;

@Service
public class MapValidationErrorService {

    public ResponseEntity<?> mapValidationErrorService(BindingResult result){
        if(result.hasErrors()){

            Map<String,String> errorMap = new HashMap<>();
            result.getFieldErrors().forEach(x ->
                    errorMap.put(x.getField() , x.getDefaultMessage())
            );

            return new ResponseEntity<>(errorMap , HttpStatus.BAD_REQUEST);
        }
        return null;
    }
}
