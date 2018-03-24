package ee.bcs.koolitus.muisikratt2.spring_app.rest.resource;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DiscussionResource {

	private Integer id;
	@NotNull
	private Integer employeeId;
	@NotNull
	private LocalDate discussionDate;

}
