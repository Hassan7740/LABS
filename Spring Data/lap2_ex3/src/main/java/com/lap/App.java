package com.lap;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

  public static <DriverManagerDataSource> void main(String[] args) {

    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

    EmployeesDao dao = (EmployeesDao) context.getBean("edao");
    System.out.println("hi");
    Employees e1 = dao.save(new Employees(600000, "hassan", "mohamed"));
    System.out.println(e1);
  }

}
