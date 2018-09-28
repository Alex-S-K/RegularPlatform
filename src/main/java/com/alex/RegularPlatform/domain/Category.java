package com.alex.RegularPlatform.domain;

import java.sql.Timestamp;
import java.util.List;

public class Category {
    // 分类id
    private int id;
    // 分类名
    private String name;
    // 创建时间
    private Timestamp createTime;

    // 关联的短信列表
    private List<Message> messages;

    // 关联的正则列表
    private List<Regular> regulars;

    // 关联的子串列表
    private List<SubRegular> subRegulars;

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

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public List<Regular> getRegulars() {
        return regulars;
    }

    public void setRegulars(List<Regular> regulars) {
        this.regulars = regulars;
    }

    public List<SubRegular> getSubRegulars() {
        return subRegulars;
    }

    public void setSubRegulars(List<SubRegular> subRegulars) {
        this.subRegulars = subRegulars;
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
