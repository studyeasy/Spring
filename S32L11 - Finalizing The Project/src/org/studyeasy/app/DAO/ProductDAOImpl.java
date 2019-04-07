package org.studyeasy.app.DAO;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.studyeasy.app.entity.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<Product> getProducts() {

		// Getting session object from sessionFactory
		Session currentSession = sessionFactory.getCurrentSession();

		// creating query
		Query<Product> theQuery = currentSession.createQuery("from products", Product.class);

		// Getting list of products
		List<Product> products = theQuery.getResultList();
		
		return products;
	}

}
