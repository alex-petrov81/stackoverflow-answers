package io.mindgames.httpfilters.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiControllers {

    @GetMapping(value = "/api/getclients")
    public ResponseEntity getAllClients() {
        return new ResponseEntity("All Clients", HttpStatus.OK);
    }

    @GetMapping(value = "/api/getusers")
    public ResponseEntity getAllUsers() {
        return new ResponseEntity("All Users", HttpStatus.OK);
    }
}


