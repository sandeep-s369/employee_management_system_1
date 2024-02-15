package net.javaguides.springboot.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.Query;

import net.javaguides.springboot.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

  @Query(value = "SELECT * FROM Employee WHERE firstName = :employeeFirstName", nativeQuery = true)
	Optional<List<Employee>> findEmployeesByFirstName(String employeeFirstName);


}
