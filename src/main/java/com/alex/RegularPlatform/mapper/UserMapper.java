package com.alex.RegularPlatform.mapper;

import com.alex.RegularPlatform.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {
    /**
     * 根据用户姓名查找用户
     *
     * @param username
     * @return
     */
    @Select("SELECT * FROM users WHERE username = #{username}")
    User find(String username);

    /**
     * 插入一个用户
     * @param user
     */
    @Insert("INSERT INTO users(username, password) VALUES(#{user.username}, #{user.password})")
    void add(@Param("user") User user);
}
