import bussiness.CategoryManager;
import bussiness.CourseManager;
import core.logger.DbLogger;
import core.logger.Logger;
import core.logger.MailLogger;
import dataAccess.JdbcCategoryDao;
import dataAccess.JdbcCourseDao;
import entities.Category;
import entities.Course;
import entities.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Course c1 = new Course(1,"deneme",new Teacher(1,"ASD"),"DENEME123",100);
        Course c2 = new Course(1,"asd",new Teacher(1,"ASD"),"DENEME123",100);
        Course c3 = new Course(1,"deneme3",new Teacher(1,"ASD"),"DENEME123",100);
        List<Course> courses = new ArrayList<>();
        courses.add(c1);
        courses.add(c2);
        List<Logger> loggers = new ArrayList<>();
        loggers.add(new DbLogger());
        loggers.add(new MailLogger());
        CourseManager cm = new CourseManager(new JdbcCourseDao(),loggers);
        cm.add(courses,c3);
        List<Course> courseListGet = cm.getAll();
        for(Course c : courseListGet) {
            System.out.println(c.getName());
        }
        CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(),loggers);
        Category category = new Category(1,"oop");
        Category category1 = new Category(2,"backend");
        Category category2 = new Category(3,"oop2");
        List<Category> categories = new ArrayList<>();
        categories.add(category);
        categories.add(category1);
        categoryManager.add(category2,categories);
    }
}