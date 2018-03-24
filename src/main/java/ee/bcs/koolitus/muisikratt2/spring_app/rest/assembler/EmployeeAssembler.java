package ee.bcs.koolitus.muisikratt2.spring_app.rest.assembler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import ee.bcs.koolitus.muisikratt2.spring_app.entity.Employee;
import ee.bcs.koolitus.muisikratt2.spring_app.rest.resource.EmployeeResource;

@Component
public class EmployeeAssembler {

	public Iterable<EmployeeResource> toResources(final List<Employee> employees) {
		final List<EmployeeResource> resources = new ArrayList<>();
		for (Employee employee : employees) {
			resources.add(EmployeeResource.builder().id(employee.getId())
					.firstName(employee.getFirstName())
					.lastName(employee.getLastName()).build());
		}
		return resources;
	}
	
	public EmployeeResource toResource(final Employee employee) {
		if(employee == null) {
			return null;
		}
		return EmployeeResource.builder().id(employee.getId()).firstName(employee.getFirstName()).lastName(employee.getLastName())
				.build();
	}
}
