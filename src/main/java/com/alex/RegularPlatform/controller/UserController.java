package com.alex.RegularPlatform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    /**
     * 登录页面
     * @return
     */
    @GetMapping("/login")
    public String login() {
        return "user/login";
    }
}
