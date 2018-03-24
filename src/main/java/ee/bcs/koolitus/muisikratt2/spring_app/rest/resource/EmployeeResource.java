package ee.bcs.koolitus.muisikratt2.spring_app.rest.resource;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class EmployeeResource {

	private Integer id;
	private String firstName;
	private String lastName;

}
