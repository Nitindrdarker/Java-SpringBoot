package com.nitin;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// Auto wiring or wiring
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // Retrieving the bean from the context
        Person person = context.getBean(Person.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Person Name: " + person.getName());
        System.out.println("Vehicle Name: " + vehicle.getName());
        System.out.println("Vehicle name of Person Name: " + person.getVehicle().getName());

        // Close the context
        context.close();



    }
}