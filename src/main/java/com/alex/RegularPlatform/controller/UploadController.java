package com.alex.RegularPlatform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/upload")
public class UploadController {
    /**
     * 展示文件上传页面
     * @return
     */
    @GetMapping("")
    public String index() {
        return "/upload/index";
    }

    @PostMapping("")
    public void upload(HttpServletResponse response, @RequestParam("file") MultipartFile file) {
        // 将文件转为一个实体数组

        // 将实体数组交给Service进行存储
    }
}
