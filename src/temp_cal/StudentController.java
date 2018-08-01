package temp_cal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/registerForm")
	public String registerForm(Model theModel) {
		
		//create new student
		Student student = new Student();
		
		//add new student to the model
		theModel.addAttribute("student", student);
		
		return "registerForm";
		
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student student){
		return "confirmation";
	}

}
