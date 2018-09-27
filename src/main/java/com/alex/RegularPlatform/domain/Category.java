package com.alex.RegularPlatform.domain;

import java.sql.Timestamp;

public class Category {
    // 分类id
    private int id;
    // 分类名
    private String name;
    // 创建时间
    private Timestamp createTime;

    /**************************** setter getter and toString *************************/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
