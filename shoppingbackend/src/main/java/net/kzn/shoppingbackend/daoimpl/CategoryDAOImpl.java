package net.kzn.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.kzn.shoppingbackend.dao.CategoryDAO;
import net.kzn.shoppingbackend.dto.Category;

//ab hum kuch dumy data adddk renge static list me
// testing purpose k liye jo bad me hum replace kr denge data base se dta ko access krke

//spring ioc ko batane ke liye hum CategoryDAOImpl ko manage krane k liye @Repository annotation ka use krte hai
// ye annotation data ka access provide karata hai-spring frame work isko manage krta hai
@Repository ("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
private static List<Category>categories=new ArrayList<Category>();

static{
	Category category=new Category();
	Category category1=new Category();
	Category category2=new Category();
	
	category.setId(1);
	category.setName("Telivision");
	category.setDesciption("This is some description for Television");
	category.setImageURL("CAT_1.png");
	categories.add(category);
	
	category1.setId(2);
	category1.setName("Mobile");
	category1.setDesciption("This is some description for Mobile");
	category1.setImageURL("CAT_2.png");
	
	categories.add(category1);
	
	category2.setId(3);
	category2.setName("Laptop");
	category2.setDesciption("This is some description for laptop");
	category2.setImageURL("CAT_3.png");
	categories.add(category2);
	
}	
	public List <Category> list() {
		return   categories;
	}
	public Category get(int id){
	//simply enhanced for loop
		for(Category category: categories){
		if(category.getId()==id)
			return  category;
		}
			return  null;
	}
}
