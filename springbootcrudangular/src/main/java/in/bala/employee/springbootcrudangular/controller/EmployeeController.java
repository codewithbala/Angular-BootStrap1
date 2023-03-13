package in.bala.employee.springbootcrudangular.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.bala.employee.springbootcrudangular.model.Employee;
import in.bala.employee.springbootcrudangular.repository.EmployeeRepository;

//Create Rest API
@RestController
@RequestMapping("/api/d6")
// /api/ is the end point we use in Rest API
public class EmployeeController {
	@Autowired
	private EmployeeRepository employeeRepository; //injecting EmployeeRepository
	
	//declare a method to get list of all Employees using Rest API
	@GetMapping("/employees")
	//localhost:8081/api/d6/employees thir REST API will be called and will return a list of employees
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();
	}
}
