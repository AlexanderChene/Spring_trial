package temp_cal;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Calculator {
	
	@RequestMapping("/cal")
	public String EnterCal() {
		return "cal";
		
	}
	
	@RequestMapping("/result")
	public String result(HttpServletRequest request, Model model ) {
		//get parameter value from webpage
		String value = request.getParameter("value");
		String unit = request.getParameter("length");
		String result="";
		double res_val = Double.parseDouble(value);
		
		if(unit.equals("mile")) {
			
			res_val*=1.61;
			result = value + " mile is " + res_val+ " kilometer";
		}else if(unit.equals("km")) {
			res_val*= 0.62;
			result = value + " km is " + res_val+ " mile";
		}
		model.addAttribute("message", result);
		return "cal";
		
	}

}
