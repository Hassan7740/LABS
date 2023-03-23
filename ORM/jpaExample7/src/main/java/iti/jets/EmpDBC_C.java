package iti.jets;

import java.util.*;
import iti.jets.EmpDBC_Q;
import jakarta.persistence.*;


public class EmpDBC_C extends EmpDBC_Q {

    public List<Employees> findByEmployeeName(String firstName) {
        
        Query findByEmployeeNAme = em.createQuery("from Employees e where e.firstName like:firstName")
                .setParameter("firstName", firstName);
        return findByEmployeeNAme.getResultList();
    }

}
