package ee.bcs.koolitus.muisikratt2.spring_app.rest;

import javax.validation.Valid;

import ee.bcs.koolitus.muisikratt2.spring_app.rest.assembler.DiscussionAssembler;
import ee.bcs.koolitus.muisikratt2.spring_app.rest.resource.DiscussionResource;
import ee.bcs.koolitus.muisikratt2.spring_app.service.DiscussionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/rest-api/discussions")
public class DiscussionRestController {

	@Autowired
	private DiscussionService discussionService;
	@Autowired
	private DiscussionAssembler discussionAssembler;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public DiscussionResource getDiscussion(@PathVariable("id") final Integer discussionId) {
		return discussionAssembler.toResource(discussionService.getDiscussion(discussionId));
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public DiscussionResource createDiscussion(@RequestBody @Valid DiscussionResource discussionResource) {
		
//		final Discussion inputDiscussionEntity = discussionAssembler.toEntity(discussionResource);
//		final Discussion afterSaveDiscussion = discussionService.saveDiscussion(inputDiscussionEntity);
//		final DiscussionResource responseDiscussionResource = discussionAssembler.toResource(afterSaveDiscussion);
//		
//		return responseDiscussionResource;
		
		return discussionAssembler.toResource(discussionService
				.saveDiscussion(discussionAssembler.toEntity(discussionResource)));
	}
}
