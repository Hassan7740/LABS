package com.lap;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import jakarta.jms.Connection;

public class App {
   
    public static <DriverManagerDataSource> void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

       EmployeesDao insert = (EmployeesDao) context.getBean("edao");

    //    int status = insert.saveEmployee(new Employees("hassan" , "mohamed"));

    //    int ustatus = insert.updateEmployee(new Employees("sherif", "ashraf"));
    //   int dstatus = insert.deleteEmployee(new Employees("sherif", "ashraf"));
       
      List<Employees> result = insert.getAllEmployeesRowMapper();

      System.out.println(result);

    }

}
