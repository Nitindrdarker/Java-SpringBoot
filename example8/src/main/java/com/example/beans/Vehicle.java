package com.example.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE) // This bean will be created as a new instance each time it is requested
public class Vehicle {
    private String name = "Audi";

    Vehicle (String name) {
        System.out.println(this.name);
        System.out.println("Vehicle constructor" + this.name + " called");
    }

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
