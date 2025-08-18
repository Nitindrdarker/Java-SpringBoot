package com.nitin;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh = context.getBean("V1", Vehicle.class);
        System.out.println(veh.getName());
        Vehicle veh2 = context.getBean(Vehicle.class);
        System.out.println(veh2.getName());
        Integer inte = context.getBean(Integer.class);
        String str = context.getBean(String.class);

        System.out.println(inte);
        System.out.println(str);



    }
}