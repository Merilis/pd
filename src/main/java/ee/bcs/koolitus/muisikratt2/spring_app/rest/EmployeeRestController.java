package ee.bcs.koolitus.muisikratt2.spring_app.rest;

import ee.bcs.koolitus.muisikratt2.spring_app.rest.assembler.EmployeeAssembler;
import ee.bcs.koolitus.muisikratt2.spring_app.rest.resource.EmployeeResource;
import ee.bcs.koolitus.muisikratt2.spring_app.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/rest-api/employees")
public class EmployeeRestController {

	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private EmployeeAssembler employeeAssembler;
	
	@RequestMapping(method = RequestMethod.GET)
	public Iterable<EmployeeResource> getList() {
		return employeeAssembler.toResources(employeeService.getEmployees());
	}
	
	@RequestMapping(value = "/{employeeId}", method = RequestMethod.GET)
	public EmployeeResource getEmployee(@PathVariable("employeeId") final Integer employeeId) {
		return employeeAssembler.toResource(employeeService.getEmployee(employeeId));
	}
	
}
