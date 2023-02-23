package com.example.demo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        final String body = "Hello ";
        return ResponseEntity.ok(body);
    }
}
