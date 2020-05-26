package model;

import java.sql.Timestamp;


public class StudentHomework {
    private Long id;
    private Long student_id;
    private Long homework_id;
    private String homework_title;
    private String homework_content;
    private Timestamp create_time;
    private Timestamp update_time;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStudentId() {
        return student_id;
    }

    public void setStudentId(Long studentId) {
        this.student_id = studentId;
    }

    public Long getHomeworkId() {
        return homework_id;
    }

    public void setHomeworkId(Long homeworkId) {
        this.homework_id = homeworkId;
    }

    public String getHomeworkTitle() {
        return homework_title;
    }

    public void setHomeworkTitle(String homeworkTitle) {
        this.homework_title = homeworkTitle;
    }

    public String getHomeworkContent() {
        return homework_content;
    }

    public void setHomeworkContent(String homeworkContent) {
        this.homework_content = homeworkContent;
    }

    public Timestamp getCreateTime() {
        return create_time;
    }

    public void setCreateTime(Timestamp createTime) {
        this.create_time = createTime;
    }

    public Timestamp getUpdateTime() {
        return update_time;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.update_time = updateTime;
    }
}
