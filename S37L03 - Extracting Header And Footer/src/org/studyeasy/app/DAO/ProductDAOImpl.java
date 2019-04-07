package org.studyeasy.app.DAO;

import java.util.List;


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
	public List<Product> getProducts() {

		// Getting session object from sessionFactory
		Session currentSession = sessionFactory.getCurrentSession();

		// creating query
		Query<Product> theQuery = currentSession.createQuery("from products", Product.class);

		// Getting list of products
		List<Product> products = theQuery.getResultList();
		
		return products;
	}
	@Override
	public void addProduct(Product product) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(product);
		
	}
	@Override
	public Product getProduct(int id) {
		Session session = sessionFactory.getCurrentSession();
        Product product = session.get(Product.class, id);
		return product;
	}
	@Override
	public void deleteProduct(int id) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("delete from products where productID=:productID");
		query.setParameter("productID", id);
		query.executeUpdate();
		
	}
	


}