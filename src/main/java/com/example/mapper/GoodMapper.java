package com.example.mapper;

import com.example.model.Good;
import com.example.model.Stall;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface GoodMapper {
    @Select("select * from good")
    List<Good> selectAllGo();

    @Select("select * from good where gid=#{gid}")
    Good selectById(@Param("gid") int gid);


    @Delete("delete from good where gid = #{gid}")
    int delGoByGid(@Param("gid") int gid);

    @Insert("insert into good (gname,price,type)" +
            "value(#{gname},#{price},#{type})")
    int addGood(Good good);

    @Update("update good set gname=#{gname},price=#{price},type=#{type} where gid=#{gid}")
    int updateSubmit(Good good);
}
