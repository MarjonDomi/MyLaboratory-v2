package com.example.mylaboratory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.example.mylaboratory.repository")
@SpringBootApplication
public class MyLaboratoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyLaboratoryApplication.class, args);
    }

}
