package org.studyeasy.spring;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView helloWorld(@RequestParam("name") String name){
		
		ModelAndView model = new ModelAndView("hello");
		model.addObject("name",name);
		return model;
	}
	
	@RequestMapping("/")
	public String homepage(){
		return "index";
	}
}
