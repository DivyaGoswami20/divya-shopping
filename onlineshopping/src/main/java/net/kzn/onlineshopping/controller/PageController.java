package net.kzn.onlineshopping.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import net.kzn.shoppingbackend.dao.CategoryDAO;
import net.kzn.shoppingbackend.dto.Category;
@Controller
public class PageController {
/*   request mapping add karenge 
 *  1.all products ko display karane ke liye
 *  2.based on category products ko display karane k liye
 */

@Autowired
private CategoryDAO  categoryDAO;

	//Adding request mapping for home

@RequestMapping(value={"/","/home","index"})
public ModelAndView index(){
	ModelAndView vb=new ModelAndView("page");
	vb.addObject("title","Home");
	vb.addObject("userClickHome",true);
	//passing the list of categories
	vb.addObject("categories",categoryDAO.list());
	return vb;
}
//method to load all the products using data base

@RequestMapping(value={"/show/all/products"})
public ModelAndView showAllProducts(){
	ModelAndView vb=new ModelAndView("page");
	vb.addObject("title","All Products");
	//passing the list of categories
	vb.addObject("userClickAllProducts",true);
	vb.addObject("categories",categoryDAO.list());
	return vb;
}

@RequestMapping(value={"/show/category/{id}/products"})
public ModelAndView showCategoryProducts(@PathVariable("id")int id){
	ModelAndView vb=new ModelAndView("page");
	//categoryDAO to fetch a single category
	//now we create simple category variable
	Category category=null;
	category=categoryDAO.get(id);
	//vb.addObject("title","All Products");
	//passing the list of categories
	vb.addObject("title",category.getName());
	vb.addObject("userClickCategoryProducts",true);
	vb.addObject("categories",categoryDAO.list());
	vb.addObject("category",category);
	

	return vb;
}

//Adding request mapping for about
@RequestMapping(value={"/about"})
public ModelAndView about( ){
	ModelAndView vb=new ModelAndView("page");
	vb.addObject("title","About Us");
	vb.addObject("userClickabout",true);
	return vb;
}

//Adding request mapping for contact
@RequestMapping(value={"/contact"})
public ModelAndView contact( ){
	ModelAndView vb=new ModelAndView("page");
	vb.addObject("title","Contact Us");
	vb.addObject("userClickcontact",true);
	
	return vb;
}

}
