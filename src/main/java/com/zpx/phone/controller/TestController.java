package com.zpx.phone.controller;

import com.zpx.phone.pojo.Result;
import com.zpx.phone.pojo.Token;
import com.zpx.phone.pojo.UserInfo;
import com.zpx.phone.pojo.UserLogin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @PostMapping("/user/oauth/token")
    public Result test(UserLogin user) {
        System.out.println(user.toString());
        //返回Result
        Result result = new Result();
        result.setCode(200);result.setMessage("success");result.setData(new Token());
        System.out.println(result);
        return result;
    }

    @GetMapping("/user/user/info")
    public Result test2() {
        Result result = new Result();
        result.setCode(200);result.setMessage("success");result.setData(new UserInfo());
        return result;
    }
}
