package com.lap;

public class Employees {
    private int emp_no;
    private String first_name;
    private String last_name;

    Employees(String f, String l) {
        first_name = f;
        last_name = l;
    }
    Employees() {
    
    }

    public int getEmp_no() {
        return emp_no;
    }

    public void setEmp_no(int emp_no) {
        this.emp_no = emp_no;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    };
}
