package model;

import java.sql.Timestamp;

public class Student {
    private Long id;
    private String name;
    private Timestamp create_time;
    private Timestamp update_time;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
