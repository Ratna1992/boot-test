package com.boot.test.controller;

import com.boot.test.model.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BootTestController {
    @GetMapping(value = "/entityEmployees", produces = {"application/json", "application/xml"})
    public ResponseEntity<List<Employee>> getEmployeesEntity() {
        return new ResponseEntity<List<Employee>>(employees(), HttpStatus.OK);
    }

    private Employee employee() {
        return new Employee("Kamla", "Sr Developer");
    }

    private List<Employee> employees() {
        List<Employee> employees = Arrays.asList(new Employee("John", "Developer"),
                new Employee("Michel", "Sr Developer"), new Employee("Harris", "Developer"),
                new Employee("Kamla", "Sr Developer"), new Employee("Jerome", "Manager"));

        return employees;
    }


}
