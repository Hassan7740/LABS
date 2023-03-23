package com.lap;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String [] args){
        ApplicationContext factory = new ClassPathXmlApplicationContext("beans.xml");
        Car instance =(Car) factory.getBean("carInstance");
        System.out.println(instance.numberOfDoors()); 

        ///////////////////////////////////////////////////////////////////////////

        Person studentInstance =(Person) factory.getBean("personInstanceId");
        System.out.println(studentInstance.carType().toString());

        ///////////////////////////////////////////////////////////////////////////

        Person employeeInstance =(Person) factory.getBean("eInstance");
        System.out.println(employeeInstance.toString());
    }
}
