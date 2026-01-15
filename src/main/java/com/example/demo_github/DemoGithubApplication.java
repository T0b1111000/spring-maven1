package com.example.dockerdemo;  // Ton package

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController  // Ajoute ça
public class DockerDemoApplication {  // Ou ton nom de classe
    public static void main(String[] args) {
        SpringApplication.run(DockerDemoApplication.class, args);
    }

    @GetMapping("/hello")  // Ajoute cette méthode
    public String hello() {
        return "Hello, World!";
    }
}
