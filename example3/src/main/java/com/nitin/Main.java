package com.nitin;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create the application context
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // Retrieve the Vehicle bean by name
        Vehicle vehicle1 = context.getBean(Vehicle.class);
        System.out.println("Vehicle 1 Name: " + vehicle1.getName());
        vehicle1.printHello();
        context.close();





    }
}