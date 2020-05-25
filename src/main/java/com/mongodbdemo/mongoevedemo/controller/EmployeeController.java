package com.mongodbdemo.mongoevedemo.controller;

import com.mongodbdemo.mongoevedemo.domain.Employee;
import com.mongodbdemo.mongoevedemo.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepo employeeRepo;

    @PostMapping(value="/save")
    public String saveEmp(@RequestBody Employee employee){
        employeeRepo.save(employee);
        return "Employee Saved";
    }

    @GetMapping(value="/emp/{id}")
    public Optional<Employee> getEmpById(@PathVariable String id){
        return employeeRepo.findById(id);
    }

    @GetMapping(value="/emp")
    public List<Employee> getEmp(){
        return employeeRepo.findAll();
    }
}
