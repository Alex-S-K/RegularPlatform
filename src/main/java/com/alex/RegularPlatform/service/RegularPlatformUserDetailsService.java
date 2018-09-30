package com.alex.RegularPlatform.service;

import com.alex.RegularPlatform.domain.RegularPlatformUserDetails;
import com.alex.RegularPlatform.domain.User;
import com.alex.RegularPlatform.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class RegularPlatformUserDetailsService implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        // 去数据库查找用户
        User user = userMapper.find(s);
        // 如果没有找到就抛出异常
        if (user == null) {
            throw new UsernameNotFoundException("用户名 " + s + " 没有找到。");
        }
        // 返回用户信息
        return new RegularPlatformUserDetails(user);
    }
}
