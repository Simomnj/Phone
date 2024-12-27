package com.zpx.phone.service.impl;

import com.zpx.phone.mapper.JustMapper;
import com.zpx.phone.pojo.Result;
import com.zpx.phone.pojo.UserLogin;
import com.zpx.phone.service.JustService;
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

        //通过文件名称，获取所有json数据List

        //遍历JsonList，发送到消息队列

    }
}
