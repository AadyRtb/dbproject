package com.example.mapper;

import com.example.model.Stall;
import com.example.model.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    @Select("select * from user")
    List<User> selectAllUs();

    @Select("select * from user where uid=#{uid}")
    User selectById(@Param("uid") int uid);


    @Delete("delete from user where uid = #{uid}")
    int delUsByUid(@Param("uid") int uid);

    @Insert("insert into user(username,phone) " +
            "value(#{username},#{phone})")
    int addUser(User user);

    @Update("update user set username=#{username} ,phone=#{phone} where uid=#{uid}")
    int updateSubmit(User user);
}
