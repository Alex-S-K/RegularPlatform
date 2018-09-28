package com.alex.RegularPlatform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    /**
     * 首页
     * @return
     */
    @GetMapping("/")
    public String index() {
        return "/home/index";
    }
}
