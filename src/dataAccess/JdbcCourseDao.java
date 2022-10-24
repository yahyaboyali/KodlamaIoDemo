package dataAccess;

import entities.Course;
import entities.Teacher;

import java.util.ArrayList;
import java.util.List;

public class JdbcCourseDao implements CourseDao{
    @Override
    public List<Course> getAll() {
        List<Course> courseList = new ArrayList<>();
        courseList.add(new Course(1,"Java",new Teacher(1,"engin"),"java 101",100));
        courseList.add(new Course(2,"Python",new Teacher(1,"Yahya"),"python 101",1020));
        courseList.add(new Course(3,"c#",new Teacher(1,"engin"),"c# 101",100));
        return courseList;
    }

    @Override
    public void add(Course course) {
        System.out.println("jdbc ile eklendi");
    }
}
