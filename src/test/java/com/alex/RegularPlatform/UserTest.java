package com.alex.RegularPlatform;

import com.alex.RegularPlatform.domain.User;
import com.alex.RegularPlatform.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {
    @Autowired
    private UserMapper mapper;

    /**
     * 想数据库加入一个用户
     */
    @Test
    public void save() {
        // 拿到加密的密码
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String password = encoder.encode("123456".trim());
        // 存储用户
        User user = new User();
        user.setUsername("alex");
        user.setPassword(password);
        System.out.println(user);
        mapper.add(user);
    }
}
