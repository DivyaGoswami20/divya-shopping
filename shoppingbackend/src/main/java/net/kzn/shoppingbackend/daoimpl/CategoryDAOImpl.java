package net.kzn.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.kzn.shoppingbackend.dao.CategoryDAO;
import net.kzn.shoppingbackend.dto.Category;

//ab hum kuch dumy data adddk renge static list me
// testing purpose k liye jo bad me hum replace kr denge data base se dta ko access krke

//spring ioc ko batane ke liye hum CategoryDAOImpl ko manage krane k liye @Repository annotation ka use krte hai
// ye annotation data ka access provide karata hai-spring frame work isko manage krta hai
@Repository("categoryDAO")
@Transactional
public class CategoryDAOImpl implements CategoryDAO {
	private static List<Category> categories = new ArrayList<Category>();

	@Autowired
	private SessionFactory sessionFactory;
	/*static {
	
		  Category category = new Category();
		  Category category1 = new Category();
		  Category category2 = new Category();
		  
		  category.setId(1); category.setName("Telivision");
		  category.setDesciption("This is some description for Television");
		  category.setImageURL("CAT_1.png"); 
		  categories.add(category);
		
		  category1.setId(2); category1.setName("Mobile");
		  category1.setDesciption("This is some description for Mobile");
		  category1.setImageURL("CAT_2.png");
		  categories.add(category1);
		
		 category2.setId(3); 
		 category2.setName("Laptop");
		 category2.setDesciption("This is some description for laptop");
		 category2.setImageURL("CAT_3.png");
		 categories.add(category2);
		  
		
		
		Category category = new Category();
		category.setId(1);
		category.setName("Telivision");
		category.setDesciption("This is some description for Television");
		category.setImageURL("CAT_1.png");
		categories.add(category);
		category = new Category();
		category.setId(1);
		category.setName("Laptop");
		category.setDesciption("This is some description for Television");
		category.setImageURL("CAT_1.png");
		categories.add(category);
		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDesciption("This is some description for Mobile");
		category.setImageURL("CAT_2.png");
		categories.add(category);
		
	}*/

	public List<Category> list() {
		String selectActiveCategory="from Category where active=:active";
		Query query=sessionFactory.getCurrentSession().createQuery(selectActiveCategory);
		query.setParameter("active", true);
		return query.getResultList();
	}

	public Category get(int id) {
		// simply enhanced for loop
		return	sessionFactory.getCurrentSession().get(Category.class,Integer.valueOf(id));
	
		 
	}

	public boolean add(Category category) {
		try {
			sessionFactory.getCurrentSession().persist(category);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public boolean update(Category category) {
		try {
			sessionFactory.getCurrentSession().update(category);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public boolean delete(Category category) {
		category.setActive(false);
		try {
			sessionFactory.getCurrentSession().update(category);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
}
