package com.test.database.postgres.postgrestestcontainersdemo.repository;

import com.test.database.postgres.postgrestestcontainersdemo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class EmployeeRepository {

    @Autowired
    NamedParameterJdbcTemplate jdbcTemplate;

    public void insert(Employee e){
        String inertSql = "INSERT INTO EMPLOYEE (id, first_name, last_name, email_id )" +
                " VALUES ( :id, :first_name, :last_name, :email_id )";
        Map<String, Object> paramMap = new LinkedHashMap<>();
        paramMap.put("id", e.getId());
        paramMap.put("first_name", e.getFirstName());
        paramMap.put("last_name", e.getLastName());
        paramMap.put("email_id", e.getEmailId());
        jdbcTemplate.update(inertSql, paramMap);
    }

}
