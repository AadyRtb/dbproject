package com.example.mapper;

import com.example.model.Good;
import com.example.model.Sell;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SellMapper {

    @Select("select *\n" +
            "from sell, good, stall\n" +
            "where sell.sid=stall.sid\n" +
            "and good.gid=sell.gid")
    List<Sell> selectAllSe();

    @Select("select *\n" +
            "from sell , good, stall\n" +
            "where good.gname=#{gname}\n" +
            "and  sell.sid=stall.sid  \n" +
            "and good.gid=sell.gid;")
    List<Sell> selectByGname(@Param("gname") String gname);

    @Select("select * from sell , good, stall" +
            " where stall.sid=#{sid} " +
            "and sell.sid=stall.sid  \n" +
            "and good.gid=sell.gid;")
    List<Sell> selectBySid(@Param("sid") int sid);

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
