package com.lap;

import org.springframework.orm.hibernate5.HibernateTemplate;

public class EmployeesDao {
    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    public Employees save(Employees employee) {
        getHibernateTemplate().save(employee);
        return employee;
    }

}
