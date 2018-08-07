package temp_cal;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class StudentController {
	
	//add initbinder ... to convert trim
	@InitBinder
	public void initBinder (WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	

	
	@RequestMapping("/registerForm")
	public String registerForm(Model theModel) {
		
		//create new student
		Student student = new Student();
		
		//add new student to the model
		theModel.addAttribute("student", student);
		
		return "registerForm";
		
	}
	
	@RequestMapping("/processForm")
	public String processForm(
			@Valid @ModelAttribute("student") Student student,
			BindingResult theBindingResult,
			HttpServletRequest request, Model model
			
			
			){
	
		if(theBindingResult.hasErrors()) {
			return "registerForm";
		}else {
		double height = Double.parseDouble(request.getParameter("height"));
		double weight = Double.parseDouble(request.getParameter("weight"));
		height /=100;
		height = height *height;
		double BMI = weight / height;
		model.addAttribute("BMI", BMI);
			
		
		
		return "confirmation";
		}
	

}
}
