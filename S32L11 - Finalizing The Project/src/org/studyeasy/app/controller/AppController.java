package org.studyeasy.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.studyeasy.app.DAO.ProductDAO;
import org.studyeasy.app.entity.Product;

@Controller
public class AppController {
	@Autowired
	private ProductDAO products;
	
	@RequestMapping("/")
	public String homepage(Model model) {
		List<Product> productList = products.getProducts();
		model.addAttribute("products", productList);
		return "homepage";
	}
	
}


