package com.zpx.phone.controller;

import com.zpx.phone.pojo.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

//登录类
@RestController
public class LoginController {

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

    @GetMapping("/user/mq/info")
    public Result test3() {
        Result result = new Result();
        result.setCode(200);result.setMessage("success");result.setData(new RabbitMQ());
        return result;
    }

    @PostMapping("/user/tenant/page")
    public Result test4(int current, int size) {
        System.out.println(current);
        System.out.println(size);
        Result result = new Result();
        result.setCode(200);result.setMessage("success");result.setData(new Tenant());
        return result;
    }

    @GetMapping("/product/pictureConfig/list")
    public Result test5() {
        Result result = new Result();
        result.setCode(200);result.setMessage("success");result.setData(new PictureConfig());
        return result;
    }
}
