package com.terahertz.employeemanager.repo;

import com.terahertz.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


//extends the Jpa repo
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    void deleteEmployeeById(Long id); //Query method to delete employee by id

    Optional<Employee> findEmployeeById(Long id); //optional incase there is no employee
}
