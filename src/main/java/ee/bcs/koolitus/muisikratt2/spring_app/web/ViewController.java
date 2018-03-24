package ee.bcs.koolitus.muisikratt2.spring_app.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/view/")
public class ViewController {

	@RequestMapping("employees-list")
	String employeesList() {
		return "employees/employees-list";
	}

	@RequestMapping("discussion-form")
	String discussionForm() {
		return "discussions/discussion-form";
	}

	@RequestMapping("discussions-view")
	String discussionsView() {
		return "discussions/discussions-view";
	}
}
