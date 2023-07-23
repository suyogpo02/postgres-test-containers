package com.test.database.postgres.postgrestestcontainersdemo.rest;

import com.test.database.postgres.postgrestestcontainersdemo.model.Employee;
import com.test.database.postgres.postgrestestcontainersdemo.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@Slf4j
public class EmployeeResource {

    @Autowired
    EmployeeRepository employeeRepository;


    @PostMapping(value = "/employee", consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> createEmployee(@RequestBody Employee e){
        try {
            employeeRepository.insert(e);
            log.info("Employee {} created successfully", e.getId());
            return ResponseEntity.status(HttpStatus.CREATED).body(e.getId());
        }catch (Exception exception){
            log.error("An exception occurred while persisting the employee {}, exception is ", e.getId(), exception);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getId());
        }
    }

}
