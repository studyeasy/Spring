package org.studyeasy.app.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.studyeasy.app.DAO.ProductDAO;
import org.studyeasy.app.entity.Product;
import org.studyeasy.app.service.AppService;

@Controller
public class AppController {
	@Autowired
	private AppService appService;
	private static final Logger logger = Logger.getLogger(AppController.class);
	
	
	@RequestMapping("/")
	public String homepage(Model model) {
		List<Product> productList = appService.getProducts();
		model.addAttribute("products", productList);
		return "homepage";
	}
	@RequestMapping("/addProductForm")
     public String addProductForm(Model model){
		Product product = new Product();
		model.addAttribute("product",product);
    	 return "addProductForm";
     }
	//Implements Add/update product functionality
	@PostMapping("/addProduct")
	public String addProduct(@ModelAttribute("product") Product product){
		appService.addProduct(product);
		logger.info("Added product : "+product.toString());
		return "redirect:/";
		
	}
	//Uses Add product functionality for update operation
	@GetMapping("/updateProductForm")
	public String updateProductForm(@RequestParam("id")
	int id, Model model){
		Product product = appService.getProduct(id);
		model.addAttribute("product",product);
		logger.info("Updated product : "+product.toString());
		//loading add product view for update operation
		return "addProductForm";	
	}
	
  @GetMapping("/deleteProduct")
   public String deleteProduct(@RequestParam("id") int id){
	   appService.deleteProduct(id);
	   return "redirect:/";
   }
  @RequestMapping("/test")
  public String test(){
	  return "test";
  }

}











