package com.zpx.phone.mapper;

import com.zpx.phone.pojo.UserLogin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface JustMapper {

    @Select("select * from user where id = #{id}")
    List<Map<String,Object>> getUserById(Integer id);
}
