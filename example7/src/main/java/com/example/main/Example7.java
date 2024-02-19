package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example7 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        // Previously, the line below generated a null, but with PostConstruct, this solves that issue.
        System.out.println("Component Vehicle name from Spring Context is: " + vehicle.getName()); // Component Vehicle name from Spring Context is: Honda
        vehicle.printHello(); // Printing Hello from Component Vehicle Bean
    }
}
