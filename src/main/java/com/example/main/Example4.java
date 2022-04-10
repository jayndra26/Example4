package com.example.main;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example4 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
         Person person = context.getBean(Person.class);
         Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println(person.getName());
        System.out.println(vehicle.getName());
        System.out.println(person.getVehicle());
    }

}
