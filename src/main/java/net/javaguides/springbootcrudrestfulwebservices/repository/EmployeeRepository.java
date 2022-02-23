package net.javaguides.springbootcrudrestfulwebservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springbootcrudrestfulwebservices.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
