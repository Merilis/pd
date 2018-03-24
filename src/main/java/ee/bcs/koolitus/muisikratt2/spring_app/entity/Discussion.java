package ee.bcs.koolitus.muisikratt2.spring_app.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "discussion")
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Discussion {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "employee_id")
	private Integer employeeId;

	@Column(name = "discussion_date")
	private LocalDate discussionDate;
}
