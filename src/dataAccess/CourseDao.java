package dataAccess;

import entities.Course;

import java.util.List;

public interface CourseDao {
    List<Course> getAll();
    void add(Course course);
}
