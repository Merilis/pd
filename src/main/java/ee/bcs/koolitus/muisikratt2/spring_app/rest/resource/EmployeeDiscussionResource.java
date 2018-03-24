package ee.bcs.koolitus.muisikratt2.spring_app.rest.resource;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class EmployeeDiscussionResource {

	private String firstName;
	private String lastName;
	private LocalDate discussionDate;

}
