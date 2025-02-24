package com.zpx.phone.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class PathReader {
    private static String staticPathName = "C:/Users/Zhangpengxiang/Desktop/Code/Json/工厂端/压力测试";
    //测试
    public static void main(String[] args) {
        try {
            // 扫描目录并返回文件名
            List<String> fileNames = Files.walk(Paths.get(staticPathName))
                    .filter(Files::isRegularFile) // 只过滤文件
                    .map(Path::toAbsolutePath) // 获取文件的绝对路径
                    .map(Path::toString) // 转为字符串
                    .collect(Collectors.toList()); // 收集到列表中
            System.out.println(fileNames);
            // 打印所有文件名
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //返回该路径下的所有文件名称
    public List<String> pathToFileName(String path) {
        try {
            // 扫描目录并返回文件名
            List<String> fileNames = Files.walk(Paths.get(path))
                    .filter(Files::isRegularFile) // 只过滤文件
                    .map(Path::toAbsolutePath) // 获取文件的绝对路径
                    .map(Path::toString) // 转为字符串
                    .collect(Collectors.toList()); // 收集到列表中
            System.out.println(fileNames);
            return fileNames;
            // 打印所有文件名
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }


    }
}
