package org.studyeasy.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller("appController")
public class AppController {

	@RequestMapping("/")
	public String homepage() {
		
		return "index";
	}
	
	@RequestMapping("/facts")
	public String fatcs() {
		
		return "facts";
	}
	
	@RequestMapping("/about")
	public String user() {
		
		return "about";
	}
	
}