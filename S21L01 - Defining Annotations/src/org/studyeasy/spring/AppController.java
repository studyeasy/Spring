package org.studyeasy.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.studyeasy.spring.DAO.AppDAOImpl;
import org.studyeasy.spring.model.User;

@Controller
public class AppController {

	
	@RequestMapping("/")
	public ModelAndView homepage() {
		ModelAndView model = new ModelAndView("index");
		List<User> users = new ArrayList<User>();
		ClassPathXmlApplicationContext context
		= new ClassPathXmlApplicationContext("/org/studyeasy/spring/DAO/Spring-AppDAOConfig.xml");
	
		AppDAOImpl DAO = context.getBean("DAOBean", AppDAOImpl.class);
		
		users = DAO.listUsers();
        model.addObject("users", users);
		context.close();
		return model;
	}
}




