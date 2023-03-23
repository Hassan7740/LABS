package com.lap;

import org.springframework.transaction.annotation.Transactional;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.PersistenceContextType;
import jakarta.persistence.PersistenceProperty;

public class EmployeesDaoImp implements EmployeeDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
        this.entityManager = entityManagerFactory.createEntityManager();
    }

    @Transactional
    public Employees save(Employees employee) {
        return entityManager.merge(employee);

    }

    public Employees findEmployees(String employeeId) {
        Employees e = entityManager.getReference(Employees.class, employeeId);
        System.out.println(entityManager.contains(e));
        return e;
    }

    @Transactional
    public void deleteEmployees(Employees employee) {
        entityManager.remove(employee);
    }
}
