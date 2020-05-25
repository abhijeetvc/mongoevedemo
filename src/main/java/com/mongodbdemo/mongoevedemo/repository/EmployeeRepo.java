package com.mongodbdemo.mongoevedemo.repository;

import com.mongodbdemo.mongoevedemo.domain.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepo extends MongoRepository<Employee,String> {
}
