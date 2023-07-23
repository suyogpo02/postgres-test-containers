package com.test.database.postgres.postgrestestcontainersdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {
    private UUID id;
    private String firstName;
    private String lastName;
    private String emailId;
}
