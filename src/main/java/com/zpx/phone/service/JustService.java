package com.zpx.phone.service;

import com.zpx.phone.pojo.UserLogin;

import java.util.List;
import java.util.Map;

public interface JustService {

    public List<Map<String, Object>> getUserInfo(Integer id);
}
