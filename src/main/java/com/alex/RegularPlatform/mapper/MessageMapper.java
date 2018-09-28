package com.alex.RegularPlatform.mapper;

import com.alex.RegularPlatform.domain.Message;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface MessageMapper {
    @Insert("INSERT INTO messages(tel_number, content, create_time, category_id) VALUES(#{msg.telNumber}, #{msg.content}, #{msg.createTime}, #{msg.category.id})")
    void add(@Param("msg") Message message);
}
