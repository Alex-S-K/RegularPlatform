package com.alex.RegularPlatform.domain;

import java.sql.Timestamp;

public class SubRegular {
    private int id;
    // 子串名
    private String name;
    // 子串内容
    private String content;
    // 分类ID
    private int categoryId;
    // 创建时间
    private Timestamp createTime;
    // 修改时间
    private Timestamp updateTime;

    /***************************** setter getter and toString *****************************/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "SubRegular{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", categoryId=" + categoryId +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
