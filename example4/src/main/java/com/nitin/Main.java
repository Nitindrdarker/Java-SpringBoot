package com.nitin;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle volkswagen = new Vehicle();
        volkswagen.setName("Volkswagen");
        Supplier<Vehicle> volkswagenSupplier = () -> volkswagen;


        Supplier<Vehicle> vehicleSupplier = () -> {
            Vehicle vehicle = new Vehicle();
            vehicle.setName("Audi");
            return vehicle;
        };

        Random random = new Random();
        int randomNumber = random.nextInt(10);
        System.out.println("Random Number: " + randomNumber);

        if(randomNumber % 2 == 0) {
            context.registerBean("volkswagen", Vehicle.class, volkswagenSupplier);

        } else {
            context.registerBean("audi", Vehicle.class, vehicleSupplier);
        }

        Vehicle volksVehicle = null;
        Vehicle audiVehicle = null;
        try {
            volksVehicle = context.getBean("volkswagen", Vehicle.class);
        } catch (Exception e) {
            System.out.println("Volkswagen bean not found, trying Audi bean.");
        }

        try {
            audiVehicle = context.getBean("audi", Vehicle.class);
        } catch (Exception e) {
            System.out.println("Audi bean not found.");
        }


        if (volksVehicle != null) {
            System.out.println("Volkswagen Name: " + volksVehicle.getName());
            volksVehicle.printHello();
        } else if (audiVehicle != null) {
            System.out.println("Audi Name: " + audiVehicle.getName());
            audiVehicle.printHello();
        } else {
            System.out.println("No vehicle bean found.");
        }


    }
}