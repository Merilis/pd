package ee.bcs.koolitus.muisikratt2.spring_app.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import ee.bcs.koolitus.muisikratt2.spring_app.entity.Discussion;
import ee.bcs.koolitus.muisikratt2.spring_app.entity.Employee;
import ee.bcs.koolitus.muisikratt2.spring_app.entity.EmployeeDiscussion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeDiscussionService {

	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private DiscussionService discussionService;

	public List<EmployeeDiscussion> getLatestEmployeesDiscussion() {

		final List<EmployeeDiscussion> result = new ArrayList<>();
		final List<Employee> employees = employeeService.getEmployees();
		for (Employee employee : employees) {
			List<Discussion> employeeDiscussions = discussionService
					.getEmployeeDiscussionsDatesDesc(employee.getId());
			LocalDate latestEmployeeDiscussionDate = null;
			if (!employeeDiscussions.isEmpty()) {
				latestEmployeeDiscussionDate = employeeDiscussions.get(0)
						.getDiscussionDate();
			}
			result.add(EmployeeDiscussion.builder()
					.firstName(employee.getFirstName())
					.lastName(employee.getLastName())
					.discussionDate(latestEmployeeDiscussionDate).build());
		}
		Collections.sort(result, new DiscussionDateComparator());

		return result;
	}

	class DiscussionDateComparator implements Comparator<EmployeeDiscussion> {

		@Override
		public int compare(EmployeeDiscussion o1, EmployeeDiscussion o2) {
			if (o1.getDiscussionDate() == null) {
				return -1;
			}
			if (o2.getDiscussionDate() == null) {
				return 1;
			}
			return o1.getDiscussionDate().compareTo(o2.getDiscussionDate());
		}

	}
}
