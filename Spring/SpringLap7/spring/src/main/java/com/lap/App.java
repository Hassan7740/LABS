package com.lap;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    /**
     * @param args
     */
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Flat f = (Flat) context.getBean(Flat.class);
        System.out.println(f.getMyNum("hassan"));

        // Car car = context.getBean(CarImp.class);

        Car car = (Car) f ; 
        System.out.println(car.numberOfDoors());
    }

}
