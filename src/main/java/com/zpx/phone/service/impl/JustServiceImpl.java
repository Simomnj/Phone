package com.zpx.phone.service.impl;

import com.zpx.phone.mapper.JustMapper;
import com.zpx.phone.pojo.Result;
import com.zpx.phone.pojo.UserLogin;
import com.zpx.phone.service.JustService;
import com.zpx.phone.utils.PathReader;
import com.zpx.phone.utils.ReadFileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class JustServiceImpl implements JustService {

    @Autowired
    private JustMapper justMapper;

    @Override
    public List<Map<String, Object>> getUserInfo(Integer id) {
        List<Map<String, Object>> user = justMapper.getUserById(id);
        return user;
    }

    @Override
    public void readToMQ(String className) {

        //通过className配置需要扫描的文件夹路径，获取所有文件名称
        PathReader pathReader = new PathReader();
        List<String> fileNames = pathReader.pathToFileName(className);

        //通过文件名称，获取所有json数据
        ReadFileUtil readFileUtil = new ReadFileUtil();
        if (fileNames!=null&&!fileNames.isEmpty()) {
            for (String fileName : fileNames) {
                String filePath = readFileUtil.getFilePath(fileName);
                //拿到Json后(不为空)，发送到消息队列
                if (!filePath.isEmpty()) {
                    //TODO: 记得换为推送消息队列数据
                    System.out.println(filePath);
                }

            }
        }



    }
}
