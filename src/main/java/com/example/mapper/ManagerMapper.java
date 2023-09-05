package com.example.mapper;

import com.example.model.Manager;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface ManagerMapper {
    @Select("select * from manager where mname=#{mname} and password=${password}")
    Manager log(@Param("mname") String mname, @Param("password") String password);
}
