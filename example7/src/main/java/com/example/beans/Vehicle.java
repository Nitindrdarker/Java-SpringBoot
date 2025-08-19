package com.example.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    private String name = "Audi";

    public Vehicle() {
        System.out.println("Vehicle constructor called");
    }


    public String getName() {
        return name;
    }
    public void printHello() {
        System.out.println("Hello from Vehicle!");
    }


    public void setName(String name) {
        this.name = name;
    }
}
