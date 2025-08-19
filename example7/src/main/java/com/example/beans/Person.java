package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Vector;

@Component
public class Person {
    private String name = "Nitin";
    @Autowired
    @Qualifier("vehicle3") // Use @Qualifier to specify which bean to inject when multiple candidates are available
    private  Vehicle vehicle;
//    private final Vehicle vehicle;
//    @Autowired
//    public Person(@Qualifier("vehicle2") Vehicle vehicle) {
//        this.vehicle = vehicle;
//    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }

     public void printHello() {
        System.out.println("Hello from Person!");
        System.out.println("Person Name: " + name);
        if (vehicle != null) {
            System.out.println("Vehicle Name: " + vehicle.getName());
        } else {
            System.out.println("Vehicle is not available.");
        }
    }

}
