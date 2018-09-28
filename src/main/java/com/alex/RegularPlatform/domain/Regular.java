package com.alex.RegularPlatform.domain;

import java.sql.Timestamp;
import java.util.List;

public class Regular {
    private int id;
    // 正则内容
    private String conent;
    // 创建时间
    private Timestamp createTime;
    // 修改时间
    private Timestamp updateTime;

    // 关联的分类
    private Category category;

    // 关联的短信列表
    private List<Message> messages;

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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    @Override
    public String toString() {
        return "Regular{" +
                "id=" + id +
                ", conent='" + conent + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
