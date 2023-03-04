package springboot.application.service;

import java.util.List;

import springboot.application.entity.Employee;

public interface EmployeeService
{
	Employee saveEmployee(Employee employee);

	List<Employee> getAllEmployee();
	
	Employee getEmployeeById(long id);
	
	Employee updateEmployee(Employee employee,long id);
	
	void deleteEmployee(long id);
	

}
