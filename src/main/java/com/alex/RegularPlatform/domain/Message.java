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
    // 分类 的id（外键）
    private int category_id;
    // 正则 的id（外键）
    private int regular_id;

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

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public int getRegular_id() {
        return regular_id;
    }

    public void setRegular_id(int regular_id) {
        this.regular_id = regular_id;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", telNumber='" + telNumber + '\'' +
                ", content='" + content + '\'' +
                ", createTime=" + createTime +
                ", status=" + status +
                ", category_id=" + category_id +
                ", regular_id=" + regular_id +
                '}';
    }
}
