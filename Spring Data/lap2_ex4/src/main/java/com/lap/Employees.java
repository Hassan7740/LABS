package com.lap;
import javax.persistence.*;
import javax.persistence.Entity;

@Entity
@Table(name = "employees", catalog = "employees")
public class Employees {

    private int empNo;
    private String firstName;
    private String lastName;

    public Employees() {
    }

    public Employees(int empNo, String firstName, String lastName) {
        this.empNo = empNo;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Id
    @Column(name = "emp_no", unique = true, nullable = false)
    public int getEmpNo() {
        return this.empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    @Column(name = "first_name", nullable = false, length = 14)
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "last_name", nullable = false, length = 16)
    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Employees [empNo=" + empNo + ", firstName=" + firstName + ", lastName=" + lastName + "]";
    }

  
}
