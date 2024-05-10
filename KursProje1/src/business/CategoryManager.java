package business;

import java.util.ArrayList;
import java.util.List;

import DAO.ICategoryDao;
import DAO.ICategoryDao;
import entities.Category;
import logging.ILogger;

public class CategoryManager {
	private ILogger[] loggers;
	private ICategoryDao categoryDao;
	private List<Category> allCategories = new ArrayList<Category>();

	public CategoryManager(ILogger[] loggers, ICategoryDao categoryDao) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;

	}

	public void add(Category category) throws Exception {
		if (findCategory(category)) {
			throw new Exception("Hata : Kategori ismi aynı olamaz");
		}

		allCategories.add(category);
		categoryDao.add(category);

		for (ILogger logger : loggers) {
			logger.log(category.getName());
		}

	}

	public boolean findCategory(Category category) {
		for (Category existingCategory : allCategories) {
			if (existingCategory.getName().equals(category.getName())) {
				return true;
			}
		}

		return false;
	}

}
