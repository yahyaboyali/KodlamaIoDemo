package bussiness;

import core.logger.Logger;
import dataAccess.CategoryDao;
import entities.Category;

import java.util.List;

public class CategoryManager {
    private CategoryDao categoryDao;

    private List<Logger> loggers;

    public CategoryManager(CategoryDao categoryDao,  List<Logger> loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }
    public void add(Category category, List<Category> categories) throws Exception {
        for(Category c : categories) {
            if(c.getName().equals(category.getName())){
                throw new Exception("aynı isimli bir kategori mevcut!");
            }
        }
        categoryDao.add(category);
        for(Logger logger : loggers){
            logger.log("category added");
        }
    }
}
