package ee.bcs.koolitus.muisikratt2.spring_app.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ee.bcs.koolitus.muisikratt2.spring_app.rest.assembler.EmployeeDiscussionAssembler;
import ee.bcs.koolitus.muisikratt2.spring_app.rest.resource.EmployeeDiscussionResource;
import ee.bcs.koolitus.muisikratt2.spring_app.service.EmployeeDiscussionService;

@RestController
@RequestMapping(path = "/rest-api/discussions-view")
public class EmployeeDiscussionRestController {

	@Autowired
	private EmployeeDiscussionService employeeDiscussionService;
	@Autowired
	private EmployeeDiscussionAssembler employeeDiscussionAssembler;
	
	@RequestMapping(method = RequestMethod.GET)
	public Iterable<EmployeeDiscussionResource> getList() {
		return employeeDiscussionAssembler.toResources(employeeDiscussionService.getLatestEmployeesDiscussion());
	}
	
}
