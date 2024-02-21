package com.example.main;

import com.example.beans.Person;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example12 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);
        System.out.println("Person name from Spring Context is: " + person.getName());  // Person name from Spring Context is: Lucy
        System.out.println("Vehicle that Person owns is: " + person.getVehicle()); // Vehicle that Person owns is: Vehicle name is - Toyota

    }
}
