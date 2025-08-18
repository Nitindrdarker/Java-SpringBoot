package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {
    @Bean(name = "V1")
    Vehicle vehicle(){
        Vehicle veh = new Vehicle();
        veh.setName("Audi 8");
        return veh;
    }

    @Bean
    String hello(){
        return "HEllo";
    }

    @Bean
    Integer number(){
        return 16;
    }
    
    @Primary
    @Bean(name = "V3")
    Vehicle vehicle3(){
        Vehicle veh = new Vehicle();
        veh.setName("Default Vehicle");
        return veh;
    }

}
