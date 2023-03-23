package com.lap;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.LinkedHashMap;

public class App {
    /**
     * @param args
     */
    public static void main(String [] args){
       
         ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
       
        // ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        ApplicationContext factory = new ClassPathXmlApplicationContext("beans.xml");
        Car instance =(Car) factory.getBean("carInstance");
        System.out.println(instance.numberOfDoors()); 

        ///////////////////////////////////////////////////////////////////////////

        Person studentInstance =(Person) factory.getBean("personInstanceId");
        System.out.println(studentInstance.carType().toString());

        ///////////////////////////////////////////////////////////////////////////

        Person employeeInstance =(Person) factory.getBean("eInstance");
        System.out.println(employeeInstance.toString());

        //////////////////////////////////////////////////////////////////

        Animal dog = (Animal) factory.getBean("dog");
        Zoo zoo = (Zoo) factory.getBean("zoo"); 
        System.out.println(zoo.getAnimals().size());
        Company company = (Company) factory.getBean("company");
        LinkedHashMap<String,Person> attendes = (LinkedHashMap<String,Person>) company.attendes;
        boolean isPresent =  attendes.containsKey("hassan");
        System.out.println(isPresent);

        //////////////////////////////////////////////////////////////

        Building building = (Building) factory.getBean("Building");

      ((ClassPathXmlApplicationContext) factory).close();

    }
}
