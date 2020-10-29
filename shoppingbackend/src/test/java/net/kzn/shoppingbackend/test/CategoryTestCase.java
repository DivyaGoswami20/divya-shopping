package net.kzn.shoppingbackend.test;


import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.kzn.shoppingbackend.dao.CategoryDAO;
import net.kzn.shoppingbackend.dto.Category;

public class CategoryTestCase {
private static AnnotationConfigApplicationContext context;
private static CategoryDAO  categoryDAO;
private Category  category;
@BeforeClass
public static void init(){
	context=new AnnotationConfigApplicationContext();
	context.scan("net.kzn.shoppingbackend");
	context.refresh();
	categoryDAO=(CategoryDAO)context.getBean("categoryDAO");
	
}
/*@Test
public void testAddCategory(){
	category=new Category();
	category.setName("Mobile");
	category.setDesciption("This is some description for Laptop");
	category.setImageURL("CAT_2.png");
	assertEquals("successfully add ",true,categoryDAO.add(category));

	category=new Category();
	category.setName("HendSet");
	category.setDesciption("This is some description for category");
	category.setImageURL("CAT_2.png");
assertEquals("successfully add ",true,categoryDAO.add(category));
}
*/
//@Test
//public void testGetCategory(){
//	category=categoryDAO.get(3);
//	
//assertEquals("successfully fetch single ategory ","Mobile",category.getName());
//}

/*@Test
public void testUpdateCategory(){
	category=categoryDAO.get(1);
assertEquals("successfully updated ",true,categoryDAO.update(category));
}*/

//@Test
//public void testDeleteCategory(){
//	category=categoryDAO.get(3);
//assertEquals("successfully deletd ",true,categoryDAO.delete(category));
//}

//@Test
//public void testListCategory(){
//	System.out.println(categoryDAO.list().size())	;
//	assertEquals("successfully fetch single category ",3,categoryDAO.list().size());	
//}
@Test
public void testCurdCategory(){
	category=new Category();
	category.setName("MAC");
	category.setDesciption("This is some description for MAC");
	category.setImageURL("CAT_1.png");
	assertEquals("successfully add ",true,categoryDAO.add(category));

category=categoryDAO.get(2);
category.setName("TV");
assertEquals("successfully updated ",true,categoryDAO.update(category));

assertEquals("successfully deletd ",true,categoryDAO.delete(category));

assertEquals("successfully fetch single category ",2,categoryDAO.list().size());

}

}
