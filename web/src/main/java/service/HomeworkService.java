package service;

import dao.HomeworkDao;
import model.Homework;
import model.StudentHomework;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Service;

import java.util.List;

@ComponentScan("java")
@Service
@Configuration
public class HomeworkService {
    private HomeworkDao homeworkDao;
    public HomeworkService(){};
    @Autowired
    public HomeworkService(HomeworkDao homeworkDao) {
        this.homeworkDao = homeworkDao;
    }

    //老师布置作业
    public boolean addHomework(Homework th) throws ClassNotFoundException {
        return homeworkDao.addHomework(th);
    }

    //查询所有学生提交的作业
    public List<StudentHomework> selectAllStudentHomework() throws ClassNotFoundException {
        return  homeworkDao.selectAllStudentHomework();
    }

    //查询所有教师布置的作业
    public List<Homework> selectAllTeacherHomework() throws ClassNotFoundException {
        return homeworkDao.selectAllTeacherHomework();
    }

    //查询某位学生提交的作业
    public List<StudentHomework> selectAStudentHomework(Long student_id) throws ClassNotFoundException {
        return homeworkDao.selectAStudentHomework(student_id);
    }

    //查询某次作业的提交情况
    public List<StudentHomework> selectAHomework(Long homework_id) throws ClassNotFoundException {
        return homeworkDao.selectAHomework(homework_id);
    }

    //学生提交作业
    public String handHomework(StudentHomework sh) throws ClassNotFoundException {
        return homeworkDao.handHomework(sh);
    }
}
