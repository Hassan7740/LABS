package com.lap;
import java.util.List;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {

  public static <DriverManagerDataSource> void main(String[] args) {

    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

    EmployeesDao dao = (EmployeesDao) context.getBean("edao");
    
    Employees e1 = dao.save(new Employees(600000, "hassan", "mohamed"));
    
    // List<Employees> e2 = dao.getEmployees();
    System.out.println(e1);

   
  }

}
