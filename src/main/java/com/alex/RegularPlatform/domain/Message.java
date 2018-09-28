package com.alex.RegularPlatform.domain;

import java.sql.Timestamp;

/**
 * 短信实体类
 */
public class Message {
    private int id;
    // 电话号码
    private String telNumber;
    // 短信内容
    private String content;
    // 创建时间
    private Timestamp createTime;
    // 是否被正则覆盖
    private boolean status;

    // 关联的分类
    private Category category;

    // 关联的规则
    private Regular regular;

    /************************* setter, getter and toString ***************************/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Regular getRegular() {
        return regular;
    }

    public void setRegular(Regular regular) {
        this.regular = regular;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", telNumber='" + telNumber + '\'' +
                ", content='" + content + '\'' +
                ", createTime=" + createTime +
                ", status=" + status +
                '}';
    }
}
