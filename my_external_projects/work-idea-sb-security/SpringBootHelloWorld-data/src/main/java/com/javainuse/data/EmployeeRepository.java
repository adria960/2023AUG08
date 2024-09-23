package com.javainuse.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javainuse.model.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
