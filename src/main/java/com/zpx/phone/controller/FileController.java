package com.zpx.phone.controller;

import com.zpx.phone.pojo.Result;
import com.zpx.phone.pojo.UserLogin;
import com.zpx.phone.service.JustService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileController {

    @Autowired
    private JustService justService;

    @GetMapping("/mysql")
    public Result<UserLogin> mysql(Integer id) {
        UserLogin userLogin = justService.getUserInfo(id);

        return Result.success(userLogin);
    }
}
