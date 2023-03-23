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
       
        
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    {
        //     // ApplicationContext factory = new ClassPathXmlApplicationContext("beans.xml");
    //     // Car instance =(Car) factory.getBean("carInstance");
    //     // System.out.println(instance.numberOfDoors()); 

    //     // ///////////////////////////////////////////////////////////////////////////

    //     // Person studentInstance =(Person) factory.getBean("personInstanceId");
    //     // System.out.println(studentInstance.carType().toString());

    //     // ///////////////////////////////////////////////////////////////////////////

    //     Person employeeInstance =(Person) context.getBean("eInstance");
    //     System.out.println(employeeInstance.toString());

    //     // //////////////////////////////////////////////////////////////////

    //     // Animal dog = (Animal) factory.getBean("dog");
    //     Zoo zoo = (Zoo) context.getBean("zoo"); 
    //     // // System.out.println(zoo.getAnimals().size());
    //     Company company = (Company) context.getBean("company");
    //     LinkedHashMap<String,Employee> attendes = (LinkedHashMap<String,Employee>) company.attendes;
    //     boolean isPresent =  attendes.containsKey("hassan");
    //     System.out.println(isPresent);

    //     // //////////////////////////////////////////////////////////////

    //     Building building = (Building) context.getBean("Building");

    //     // company.printMap();

    //  ////////////////////////////////////////////////////////////////////////

    //  Hibernate props =(Hibernate)context.getBean("property");
    //  System.out.println(props.getName());

    //  Room room = (Room) context.getBean("room1");
    //  room.getdoorRoom();
    }
 
    Building b1 =(Building) context.getBean("building");
    System.out.println(b1);
    
    Employee e1 = (Employee) context.getBean("employee");

}

}
