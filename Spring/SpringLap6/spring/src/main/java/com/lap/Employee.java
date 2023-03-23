package com.lap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.stereotype.Component;

@Component
public class Employee implements Person {
    @Autowired
    private Car car;
    private String name;
    private int age;
    private boolean isMarried;

    @Override
    public Car carType() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    // public Employee(String name, int age, boolean isMarried) {
    //     this.name = name;
    //     this.age = age;
    //     this.isMarried = isMarried;
    // }

    public String toString() {
        return "name is " + this.name + " age is " + this.age + " Married : " + this.isMarried;
    }

}
