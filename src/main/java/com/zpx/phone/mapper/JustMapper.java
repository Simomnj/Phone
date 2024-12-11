package com.zpx.phone.mapper;

import com.zpx.phone.pojo.UserLogin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface JustMapper {

    @Select("select * from user where id = #{id}")
    public UserLogin getUserById(Integer id);
}
