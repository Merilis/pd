package ee.bcs.koolitus.muisikratt2.spring_app.rest.assembler;

import ee.bcs.koolitus.muisikratt2.spring_app.entity.Discussion;
import ee.bcs.koolitus.muisikratt2.spring_app.rest.resource.DiscussionResource;
import org.springframework.stereotype.Component;

@Component
public class DiscussionAssembler {

	public Discussion toEntity(final DiscussionResource discussionResource) {
		return Discussion.builder().id(discussionResource.getId()).employeeId(discussionResource.getEmployeeId())
				.discussionDate(discussionResource.getDiscussionDate()).build();
	}
	
	public DiscussionResource toResource(final Discussion discussion) {
		if(discussion == null) {
			return null;
		}
		return DiscussionResource.builder().id(discussion.getId()).employeeId(discussion.getEmployeeId())
				.discussionDate(discussion.getDiscussionDate()).build();
	}
}
