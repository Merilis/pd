package ee.bcs.koolitus.muisikratt2.spring_app.service;

import java.util.List;

import ee.bcs.koolitus.muisikratt2.spring_app.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ee.bcs.koolitus.muisikratt2.spring_app.entity.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getEmployees() {
		return employeeRepository.findAll();
	}
	
	public Employee getEmployee(Integer id) {
		return employeeRepository.getOne(id);
	}
	
}
