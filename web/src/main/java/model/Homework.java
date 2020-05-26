package model;


import java.sql.Timestamp;

public class Homework {
    private Long id;
    private String title;
    private String content;
    private Timestamp create_time;
    private Timestamp update_time;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
