package com.example.mapper;

import com.example.model.Buy;
import com.example.model.Sell;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface BuyMapper {

    @Select("select * from buy")
    List<Buy> selectAllBu();

    @Select("select * from buy where gid=#{gid}")
    List<Buy> selectByGid(@Param("gid") int gid);

    @Select("select * from buy where sid=#{sid}")
    List<Buy> selectBySid(@Param("sid") int sid);

    @Select("select * from buy where uid=#{uid}")
    List<Buy> selectByUid(@Param("sid") int sid);

    @Select("select * from sell where gid = #{gid} and sid=#{sid}")
    Sell selectById(@Param("gid") int gid,@Param("sid") int sid);

    @Delete("delete from sell where gid = #{gid} and sid=#{sid}")
    int delSeById(@Param("gid") int gid,@Param("sid") int sid);

    @Insert("insert into sell (gid,sid,stock,price)" +
            "value(#{gid},#{sid},#{stock},#{price})")
    int addSell(Sell sell);

    @Update("update sell set gid=#{gid},sid=#{sid} ,stock=#{stock},price=#{price} where gid=#{gid}" +
            "and sid=#{sid}")
    int updateSubmit(Sell sell);
}
