package ee.bcs.koolitus.muisikratt2.spring_app.rest.assembler;

import java.util.ArrayList;
import java.util.List;

import ee.bcs.koolitus.muisikratt2.spring_app.entity.EmployeeDiscussion;
import org.springframework.stereotype.Component;

import ee.bcs.koolitus.muisikratt2.spring_app.rest.resource.EmployeeDiscussionResource;

@Component
public class EmployeeDiscussionAssembler {

	public Iterable<EmployeeDiscussionResource> toResources(final List<EmployeeDiscussion> employeesDiscussion) {
		final List<EmployeeDiscussionResource> resources = new ArrayList<>();
		for (EmployeeDiscussion employeeDiscussion : employeesDiscussion) {
			resources.add(EmployeeDiscussionResource.builder()
					.firstName(employeeDiscussion.getFirstName())
					.lastName(employeeDiscussion.getLastName())
					.discussionDate(employeeDiscussion.getDiscussionDate())
					.build());
		}
		return resources;
	}

}
