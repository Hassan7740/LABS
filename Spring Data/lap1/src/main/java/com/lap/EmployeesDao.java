package com.lap;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;

import jakarta.resource.cci.ResultSet;

public class EmployeesDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int saveEmployee(Employees e) {
        String query = "insert into  (emp_no , first_name , last_name) values('" + 600000 + "','" + e.getFirst_name()
                + "','" + e.getLast_name() + "')";
        return jdbcTemplate.update(query);
    }

    public int updateEmployee(Employees e) {
        String query = "update  employees set first_name = '" + e.getFirst_name() + "' ,  last_name ='"
                + e.getLast_name() + "' where emp_no = 600000 ";
        return jdbcTemplate.update(query);
    }

    public int deleteEmployee(Employees e) {
        String query = "delete from  employees  where emp_no = 600000 ";
        return jdbcTemplate.update(query);
    }

    public List<Employees> getAllEmployeesRowMapper() {
        return jdbcTemplate.query("select * from employees limit  10", new RowMapper<Employees>() {
            @Override
            public Employees mapRow(java.sql.ResultSet rs, int rownumber) throws SQLException {
                Employees e = new Employees();
                e.setEmp_no(rs.getInt(1));
                return e;
            }
        });
    }
}
