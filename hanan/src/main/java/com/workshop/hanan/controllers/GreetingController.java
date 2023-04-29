package com.workshop.hanan.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/greeting")
public class GreetingController {

    @GetMapping
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("Hello from controller");

    }
    @GetMapping("/say-goodbye")
    public ResponseEntity<String> sayBye(){
        return ResponseEntity.ok("Bye !");
    }
}
