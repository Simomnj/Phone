package com.zpx.phone.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class ReadFileUtil {

    public static String FilePath = "C:/Users/Zhangpengxiang/Desktop/Code/Json/工厂端/素材/正常消息.json";
    //测试
    public static void main(String[] args) {

        try {
            // 读取JSON文件并转换为String
            String jsonString = new String(Files.readString(new File(FilePath).toPath()));
            System.out.println(jsonString);
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

    public String getFilePath(String fileName) {
        try {
            // 读取JSON文件并转换为String
            String jsonString = new String(Files.readString(new File(fileName).toPath()));
            System.out.println(jsonString);
            return jsonString;
        } catch (
                IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
