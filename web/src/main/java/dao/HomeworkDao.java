package dao;

import model.Homework;
import model.StudentHomework;

import java.util.List;
public interface HomeworkDao {
    /**
     * 老师布置新作业
     * @return true or false
     */
    boolean addHomework(Homework th);

    /**
     * 学生提交作业
     */
    String handHomework(StudentHomework sh);


    /**
     * 查询所有学生提交的作业
     * @return 返回查询结果
     */
    List<StudentHomework> selectAllStudentHomework();

    /**
     * 查询所有老师布置的作业
     * @return 返回查询结果
     */
    List<Homework> selectAllTeacherHomework();


    /**
     * 查询某位学生提交的作业
     * @return 返回为学号为id的作业记录
     */
    List<StudentHomework> selectAStudentHomework(Long student_id);

    /**
     * 查询某次作业的提交情况
     * @return 返回为作业编号为id的作业记录
     */
    List<StudentHomework> selectAHomework(Long homework_id);

}
