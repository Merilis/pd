package ee.bcs.koolitus.muisikratt2.spring_app.repository;

import java.util.List;

import ee.bcs.koolitus.muisikratt2.spring_app.entity.Discussion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscussionRepository extends JpaRepository<Discussion, Integer> {

	// !!! Use attribute names defined in the entity class !!!
	// @Query("SELECT d FROM Discussion d WHERE d.employeeId = ?#{[0]} ORDER BY discussionDate DESC")
	// SQL: SELECT * FROM employee as E LEFT JOIN (select employee_id,MAX(discussion_date) FROM discussion GROUP by employee_id) ON (E.id = employee_id)
	List<Discussion> findByEmployeeIdOrderByDiscussionDateDesc(Integer employeeId);

}
