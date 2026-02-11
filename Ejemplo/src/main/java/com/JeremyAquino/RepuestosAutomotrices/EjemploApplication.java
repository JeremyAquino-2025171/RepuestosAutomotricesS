package com.JeremyAquino.RepuestosAutomotrices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class EjemploApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(EjemploApplication.class, args);
    }

    @Override
    public void run (String... args) throws Exception{
        System.out.println("Test Api");
    }
}
