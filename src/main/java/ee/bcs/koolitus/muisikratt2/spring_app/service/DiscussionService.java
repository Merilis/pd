package ee.bcs.koolitus.muisikratt2.spring_app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ee.bcs.koolitus.muisikratt2.spring_app.entity.Discussion;
import ee.bcs.koolitus.muisikratt2.spring_app.repository.DiscussionRepository;

@Service
public class DiscussionService {

	@Autowired
	private DiscussionRepository discussionRepository;
	
	public Discussion saveDiscussion(Discussion discussion) {
		return discussionRepository.save(discussion);
	}

	public Discussion getDiscussion(final Integer id) {
		return discussionRepository.getOne(id);
	}
	
	public List<Discussion> getEmployeeDiscussionsDatesDesc(final Integer employeeId) {
		return discussionRepository.findByEmployeeIdOrderByDiscussionDateDesc(employeeId);
	}
	
}
