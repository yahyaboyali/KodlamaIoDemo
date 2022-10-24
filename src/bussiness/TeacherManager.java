package bussiness;

import core.logger.Logger;
import dataAccess.TeacherDao;
import entities.Teacher;

import java.util.List;

public class TeacherManager {
    private TeacherDao teacherDao;
    private List<Logger> loggers;

    public TeacherManager(TeacherDao teacherDao, List<Logger> loggers) {
        this.teacherDao = teacherDao;
        this.loggers = loggers;
    }
    public void add(Teacher teacher){
        teacherDao.add(teacher);
        for(Logger log : loggers){
            log.log("teacher added");
        }
    }
}
