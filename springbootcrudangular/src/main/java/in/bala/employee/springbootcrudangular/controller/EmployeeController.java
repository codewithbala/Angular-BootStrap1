package in.bala.employee.springbootcrudangular.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.bala.employee.springbootcrudangular.exception.ResourceNotFoundException;
import in.bala.employee.springbootcrudangular.model.Employee;
import in.bala.employee.springbootcrudangular.repository.EmployeeRepository;

//Create Rest API
@RestController
@RequestMapping("/api/d6")
// /api/ is the end point we use in Rest API
public class EmployeeController {
	@Autowired
	private EmployeeRepository employeeRepository; //injecting EmployeeRepository
	@CrossOrigin(origins= "http://localhost:4200")
	//declare a method to get list of all Employees using Rest API
	@GetMapping("/employees")
	//localhost:8081/api/d6/employees thir REST API will be called and will return a list of employees
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();
	}
	@CrossOrigin(origins= "http://localhost:4200")
	//Create employee rest api
	@PostMapping("/employees")
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeRepository.save(employee);
	}
	//get Employee by id rest API
	@CrossOrigin(origins= "http://localhost:4200")
	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable long id) {
		Employee employee = employeeRepository.findById(id)
				.orElseThrow(()-> new ResourceNotFoundException("Employee doesn't exist with id: "+id) );
		return ResponseEntity.ok(employee);
	}
	@CrossOrigin(origins= "http://localhost:4200")
	@PutMapping("/employees/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable Long id,@RequestBody Employee employeeDetails){
		Employee employee = employeeRepository.findById(id)
				.orElseThrow(()-> new ResourceNotFoundException("Employee doesn't exist with id: "+id) );
		employee.setFirstName(employeeDetails.getFirstName());
		employee.setDeptName(employeeDetails.getDeptName());
		employee.setEmailId(employeeDetails.getEmailId());
		Employee updateEmployee = employeeRepository.save(employee);
		return ResponseEntity.ok(updateEmployee);
	}
}
