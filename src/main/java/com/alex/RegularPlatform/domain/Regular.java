package com.alex.RegularPlatform.domain;

import java.sql.Timestamp;

public class Regular {
    private int id;
    // 正则内容
    private String conent;
    // 分类ID
    private int categoryId;
    // 创建时间
    private Timestamp createTime;
    // 修改时间
    private Timestamp updateTime;

    /*************************** setter getter and toString *****************************/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getConent() {
        return conent;
    }

    public void setConent(String conent) {
        this.conent = conent;
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
        return "Regular{" +
                "id=" + id +
                ", conent='" + conent + '\'' +
                ", categoryId=" + categoryId +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
