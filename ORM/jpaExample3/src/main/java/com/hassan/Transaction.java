package com.hassan;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

public class Transaction {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("lab3");
    EntityManager em = emf.createEntityManager();

    Student s1 = new Student("hassan", "mohamed", "java_spring");

//    Date hire_date = new java.sql.Date(javaDate.getTime());
    LocalDate obj = LocalDate.of(2008 , 12 , 10);
    Teacher t1 = new Teacher("ahmed", "hassan",  obj);

    void teacherTransaction() {
        em.getTransaction().begin();
        em.persist(t1);
        em.getTransaction().commit();
    }

    void studentTransaction() {
        em.getTransaction().begin();
        em.persist(s1);
        em.getTransaction().commit();
    }

}
