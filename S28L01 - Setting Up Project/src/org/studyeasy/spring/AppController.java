package org.studyeasy.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("appController")
public class AppController {

	@RequestMapping("/")
	public String homepage() {
		
		return "index";
	}
	
	@RequestMapping("/contact")
	public String admin() {
		
		return "contact";
	}
	
	@RequestMapping("/about")
	public String user() {
		
		return "about";
	}
	

}












