package dao;

import model.Student;

import java.util.List;

public interface StudentDao {
    /**
     * 添加学生
     * @return 添加是否成功
     */
    boolean addStudent(Student newStudent);

    /**
     * 选择所有学生
     * @return 学生记录
     */
    List<Student> selectAllStudent();
}
