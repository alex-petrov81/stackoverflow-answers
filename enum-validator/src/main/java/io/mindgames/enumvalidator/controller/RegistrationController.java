package io.mindgames.enumvalidator.controller;

import io.mindgames.enumvalidator.dto.UserDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class RegistrationController {

    private static final String REGISTER_USER = "/register";

    @PostMapping(value = REGISTER_USER)
    public ResponseEntity register(@Valid @RequestBody UserDTO userRegistrationRequest) {
        return new ResponseEntity("register", HttpStatus.OK);
    }

}


