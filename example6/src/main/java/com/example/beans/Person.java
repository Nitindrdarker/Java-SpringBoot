package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Vector;

@Component
public class Person {
    private String name = "Nitin";
    //1. If you want to make it mandatory, remove 'required = false'
//    @Autowired(required = false) // Optional dependency injection
//    private Vehicle vehicle;




//    private Vehicle vehicle;
    //2. you can use @Autowired to inject the Vehicle bean
//    @Autowired
//    public void setVehicle(Vehicle vehicle) {
//        this.vehicle = vehicle;
//
//    }


    //3. Constructor injection is a preferred way to inject dependencies
    private final Vehicle vehicle;
    @Autowired
    public Person(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
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
