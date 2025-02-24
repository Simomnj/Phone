package com.zpx.phone.service.impl;

import com.zpx.phone.service.TestService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class TestServiceImpl implements TestService {

    @Override
    public String savePng(MultipartFile file) {
        // 获取当前时间并格式化为 "yyyy-MM-dd-HH-mm-ss"
        String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());

        // 生成保存的文件名
        String fileName = timeStamp + ".png";  // 假设上传的是PNG格式

        // 创建保存目录
        File directory = new File(UPLOAD_DIR);
        if (!directory.exists()) {
            directory.mkdirs();
        }

        // 保存文件到指定目录
        File serverFile = new File(directory, fileName);
        try {
            file.transferTo(serverFile);
            return "文件上传成功，保存为: " + fileName;
        } catch (IOException e) {
            e.printStackTrace();
            return "文件上传失败！";
        }
    }
}
