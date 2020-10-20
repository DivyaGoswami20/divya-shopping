package net.kzn.shoppingbackend.dao;

import java.util.List;

import net.kzn.shoppingbackend.dto.Category;

public interface CategoryDAO {

	/*
	 *  sabse phle hm list method bana lenge 
	 *  kunki backand project connect with fronted project
	 *  list method create krenge jis se hm list of category return kra sake jo hmare proect me hai 
	 *
	 */
	
	List <Category> list();
	
	Category get(int id);
 	
}
