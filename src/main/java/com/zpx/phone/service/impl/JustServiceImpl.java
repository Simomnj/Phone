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
}
