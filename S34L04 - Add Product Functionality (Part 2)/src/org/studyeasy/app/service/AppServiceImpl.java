package org.studyeasy.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.studyeasy.app.DAO.ProductDAO;
import org.studyeasy.app.entity.Product;
@Service
public class AppServiceImpl implements AppService {
	@Autowired
	private ProductDAO productDAO;
	@Transactional
	@Override
	public List<Product> getProducts() {
		
		return productDAO.getProducts();
	}

}
