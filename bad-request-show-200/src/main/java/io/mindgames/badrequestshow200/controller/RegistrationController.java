package io.mindgames.badrequestshow200.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    @GetMapping("api/path")
    public ResponseEntity register() {
        return ResponseEntity.badRequest().build();
    }

}


