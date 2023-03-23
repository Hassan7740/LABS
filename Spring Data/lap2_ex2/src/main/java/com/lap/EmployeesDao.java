package com.lap;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class EmployeesDao {
    private Session session;

    public void setSessionFactory(SessionFactory sessionFactory) {
        session =  sessionFactory.openSession();
    }

    public Employees save(Employees user) {
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        return user;
    }

}
