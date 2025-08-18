package com.example.config;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Vehicle vehicle() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Audi");
        return vehicle;
    }
    // manual wiring
//    @Bean
//    public Person person() {
//        Person person = new Person();
//        person.setName("John Doe");
//        person.setVehicle(vehicle());
//        return person;
//    }

// auto wiring
    // This method will automatically inject the Vehicle bean into the Person bean
    // due to the method parameter type matching the Vehicle bean type.
    @Bean
    public Person person(Vehicle vehicle) {
        Person person = new Person();
        person.setName("John Doe");
        person.setVehicle(vehicle);
        return person;
    }
}
