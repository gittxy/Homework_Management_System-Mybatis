package service;

import dao.StudentDao;
import model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Service;

import java.util.List;

@ComponentScan("java")
@Service
@Configuration
public class StudentService {
    private StudentDao studentDao;

    public StudentService(){};
    @Autowired
    public StudentService(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    //老师添加学生
    public boolean addStudent(Student newStudent) throws ClassNotFoundException {
        return studentDao.addStudent(newStudent);
    }

    //查询所有的学生
    public List<Student> selectAllStudent() throws ClassNotFoundException {
        return studentDao.selectAllStudent();
    }

}
