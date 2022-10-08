package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("hallo")
    public List<Employee> Hello()
    {
        Employee emp = new Employee() ;
        emp.setName("Agus");
        emp.setAge(33);
        return List.of(emp);
    }
}

class Employee {
    private String Name;
    private int Age;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    @Override
    public String toString() {
        return "Employee{Age=" + Age + ", name= " + (Name.equals("") ? "empty" : Name) + "}";
    }
}

