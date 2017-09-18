package com.london.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import com.london.shoppingbackend.dao.categoryDAO;
import com.london.shoppingbackend.dto.Category;

public class CategoryDAOImpl implements categoryDAO {

	private static List<Category> categories = new ArrayList<>();

	static {

		Category category = new Category();

		// adding first category
		category.setId(1);
		category.setName("Televisions");
		category.setDescription("This the description for the television");
		category.setImageURL("CAT_1.png");

		categories.add(category);

		// adding Second category
		category.setId(2);
		category.setName("Mobiles");
		category.setDescription("This the description for the Mobiles");
		category.setImageURL("CAT_2.png");

		categories.add(category);

		// adding first category
		category.setId(3);
		category.setName("Laptops");
		category.setDescription("This the description for the Laptops");
		category.setImageURL("CAT_3.png");

		categories.add(category);

	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

}
