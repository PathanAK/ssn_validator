package com.asif.ssnwebapi.Controller;

import com.asif.ssnwebapi.Service.ValidatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValidatorController {

    @Autowired
    private ValidatorService service;

    @GetMapping("/ssn/{ssn}")
    public ResponseEntity<String> validateCitizen(@PathVariable Integer ssn) {
        return new ResponseEntity<>(service.validate(ssn), HttpStatus.OK);
    }
}
