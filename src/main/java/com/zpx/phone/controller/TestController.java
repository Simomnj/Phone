package com.zpx.phone.controller;

import com.zpx.phone.pojo.Result;
import com.zpx.phone.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class TestController {

    // 配置图片保存的目录
    private static final String UPLOAD_DIR = "D:/test"; // 请替换为实际路径

    @Autowired
    private TestService testService;

    @PostMapping("/upload")
    public Result test(@RequestParam("file") MultipartFile file){
        return Result.success(testService.savePng(file));
    }
}
