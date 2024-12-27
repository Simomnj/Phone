package com.zpx.phone.controller;

import com.zpx.phone.pojo.Result;
import com.zpx.phone.pojo.UserLogin;
import com.zpx.phone.service.JustService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController("/file")
public class FileController {

    @Autowired
    private JustService justService;

    @GetMapping("/mysql")
    public Result<Object> mysql(Integer id) {
        List<Map<String, Object>> userLogin = justService.getUserInfo(id);
        //判断是否为空
        if(id == null||userLogin==null|| userLogin.isEmpty()) {
            return Result.failure("id不存在！");
        }
        return Result.success(userLogin);
    }
    @GetMapping("/readToMQ")
    public Result<Object> readToMQ(String className) {
        justService.readToMQ(className);
        return Result.success();
    }
}
