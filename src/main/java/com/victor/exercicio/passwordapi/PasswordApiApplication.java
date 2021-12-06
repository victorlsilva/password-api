package com.victor.exercicio.passwordapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.victor.exercicio.passwordapi.constraint"})
public class PasswordApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(PasswordApiApplication.class, args);
    }

}
