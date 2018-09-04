package io.mindgames.validatorbeaninjection.controller;

import io.mindgames.validatorbeaninjection.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.Validator;

@RestController
public class RegistrationController {

    private static final String REGISTER_USER = "/register";

    @Qualifier("localValidatorFactoryBean")
    @Autowired
    private Validator validator;

    @PostMapping(value = REGISTER_USER)
    public ResponseEntity register(@RequestBody UserDTO userRegistrationRequest) {
        validator.validate(userRegistrationRequest);
        return new ResponseEntity("register", HttpStatus.OK);
    }

}


