package oopWithNLayeredApp.business;

import java.util.ArrayList;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.BaseDatabase;
import oopWithNLayeredApp.entities.Category;

public class CategoryManager {
	private BaseDatabase baseDatabase;
	private ArrayList<Logger> loggers;
	private ArrayList<Category> categoryList;
	
	public CategoryManager(BaseDatabase baseDatabase, ArrayList<Logger> loggers, ArrayList<Category> categoryList) {
		this.baseDatabase = baseDatabase;
		this.loggers = loggers;
		this.categoryList = categoryList;
	}
	
	public void add(Category category) throws Exception {
		
		for (Category ctgrylst : categoryList) {
			if(ctgrylst.getName().contains(category.getName())) {
				throw new Exception("Bu kategoriden zaten var.");
			}
		}
		
		baseDatabase.add(category);
		categoryList.add(category);
		System.out.println("Kategori eklendi : " + category.getName());
		
		for (Logger logger : loggers) {
			logger.log(category.getName());
		}
		
	}
	
	
	
}