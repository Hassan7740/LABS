package com.lap;

public interface EmployeeDao {
    public Employees save(Employees employee);
    public Employees findEmployees(String employeeId);
    public void deleteEmployees(Employees employee);
}
