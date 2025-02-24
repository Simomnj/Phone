package com.zpx.phone.service.impl;

import com.zpx.phone.mapper.JustMapper;
import com.zpx.phone.pojo.Result;
import com.zpx.phone.pojo.UserLogin;
import com.zpx.phone.service.JustService;
import com.zpx.phone.utils.PathReader;
import com.zpx.phone.utils.ReadFileUtil;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class JustServiceImpl implements JustService {

    @Autowired
    private JustMapper justMapper;
    @Autowired
    private AmqpTemplate amqpTemplate;


    @Override
    public List<Map<String, Object>> getUserInfo(Integer id) {
        List<Map<String, Object>> user = justMapper.getUserById(id);
        return user;
    }

    @Override
    public String readToMQ(String className) {

        //通过className配置需要扫描的文件夹路径，获取所有文件名称
        PathReader pathReader = new PathReader();
        List<String> fileNames = pathReader.pathToFileName(className);
        //通过文件名称，获取所有json数据
        ReadFileUtil readFileUtil = new ReadFileUtil();
        for (String fileName : fileNames) {
            //拿到Json后，发送到消息队列
            String string = readFileUtil.getFilePath(fileName);
            amqpTemplate.convertAndSend("intelligent.platform.set.of.pictures.exchange", "10187", string);
        }

        return "共发送"+fileNames.size()+"条数据";
    }

    @Override
    public void sendToMQ(String message) {
        amqpTemplate.convertAndSend("intelligent.platform.set.of.pictures.exchange", "10187", message);
    }
}
