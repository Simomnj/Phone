package com.zpx.phone.controller;

import com.zpx.phone.pojo.Result;
import com.zpx.phone.pojo.UserLogin;
import com.zpx.phone.service.JustService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class FileController {

    @Autowired
    private JustService justService;

    @GetMapping("/mysql")
    public Result<Object> mysql(Integer id) {
        List<Map<String, Object>> userLogin = justService.getUserInfo(id);
        return Result.success(userLogin);
    }
}
