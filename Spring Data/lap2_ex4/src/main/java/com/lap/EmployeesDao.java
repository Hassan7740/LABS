package com.lap;

import java.util.List;

import org.hibernate.FlushMode;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;



public class EmployeesDao {
    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Transactional(readOnly = false)
    public Employees save(Employees employee) {
        // getHibernateTemplate().getSessionFactory().getCurrentSession().setHibernateFlushMode(FlushMode.AUTO);
        getHibernateTemplate().save(employee);
        return employee;
    }

    // public List<Employees> getEmployees(){
    //     String query = "select e from Employees e where e.empNo = 600000" ;
    //     List<Employees> resualt = (List<Employees>) getHibernateTemplate().find(query);
    //     return resualt ; 
    // }
}
