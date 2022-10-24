package bussiness;
import core.logger.Logger;
import dataAccess.CourseDao;
import entities.Course;

import java.util.List;

public class CourseManager {
    private CourseDao courseDao;
    private List<Logger> loggers;
    public CourseManager(CourseDao courseDao, List<Logger> loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }
    public void add(List<Course> courseList, Course course) throws Exception {

        for( Course c : courseList) {
            if(c.getName().equals(course.getName())){
                throw new Exception("aynı isimde başka bir kurs var!");
            }
        }

        if(course.getPrice() <0 ){
            throw new Exception("kurs fiyatı negatif olamaz!");
        }
        courseDao.add(course);
        for(Logger logger : loggers) {
            logger.log("ekleme işlemi yapıldı");
        }
    }
    public List<Course> getAll(){
        for(Logger logger : loggers) {
            logger.log("kurs  listelendi ");
        }
        return courseDao.getAll();
    }
}
