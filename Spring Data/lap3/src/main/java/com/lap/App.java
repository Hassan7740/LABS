package com.lap;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

  public static <DriverManagerDataSource> void main(String[] args) {

    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

    EmployeeDao dao = context.getBean(EmployeeDao.class);
    // Employees e1 = new Employees();
    // e1.setEmpNo(600000);
    // e1.setFirstName("ahmed");
    // e1.setLastName("hassan");
    // dao.save(e1);
    // System.out.println(dao.findEmployees("600000"));
    Employees e1 = dao.findEmployees("10002");
    // System.out.println(e1);
    // e1 = dao.save(e1);
    dao.deleteEmployees(e1);

  }

}
