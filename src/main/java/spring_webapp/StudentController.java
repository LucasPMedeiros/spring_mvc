package spring_webapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model studentModel) {
		Student student = new Student();
		studentModel.addAttribute("student", student);
		String message = "student-form";
		return message;
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student studentModel) {
		String message = "student-confirmation";
		return message;	
	}
}
