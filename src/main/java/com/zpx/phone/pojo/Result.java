package com.zpx.phone.pojo;

import lombok.Data;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Data
public class Result<T> {

    private int code;           // 状态码
    private String message;     // 响应的消息
    private T data;             // 返回的数据
    private String timestamp;   // 响应时间（格式化后的时间）

    // 默认构造函数
    public Result() {
        this.timestamp = getCurrentTime();
    }

    // 成功的构造函数
    public Result(int code, String message) {
        this.code = code;
        this.message = message;
        this.timestamp = getCurrentTime();
    }

    // 成功且带数据的构造函数
    public Result(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
        this.timestamp = getCurrentTime();
    }

    // 获取当前时间并格式化为 yyyy-MM-dd HH:mm:ss
    private String getCurrentTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return now.format(formatter);
    }

    // 静态工厂方法：返回成功响应（自动填充消息）
    public static <T> Result<T> success(T data) {
        return new Result<>(200, "操作成功", data);
    }

    // 静态工厂方法：返回成功响应（无数据）
    public static <T> Result<T> success() {
        return new Result<>(200, "操作成功", null);
    }

    // 静态工厂方法：返回失败响应
    public static <T> Result<T> failure(String message) {
        return new Result<>(500, message, null);
    }

    // 静态工厂方法：返回失败响应，带错误码
    public static <T> Result<T> failure(int code, String message) {
        return new Result<>(code, message, null);
    }

}
