package springboot.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import springboot.application.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
