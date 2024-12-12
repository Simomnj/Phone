package com.zpx.phone.service.impl;

import com.zpx.phone.mapper.JustMapper;
import com.zpx.phone.pojo.Result;
import com.zpx.phone.pojo.UserLogin;
import com.zpx.phone.service.JustService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JustServiceImpl implements JustService {

    @Autowired
    private JustMapper justMapper;

    @Override
    public Object getUserInfo(Integer id) {
        Object o = justMapper.getUserById(id);
        return o;
    }
}
