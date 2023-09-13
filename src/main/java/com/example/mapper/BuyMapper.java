package com.example.mapper;

import com.example.model.Buy;
import com.example.model.Sell;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface BuyMapper {

    @Select("select * from buy,user,good" +
            " where buy.uid=user.uid" +
            " and good.gid=buy.gid")
    List<Buy> selectAllBu();

    @Select("select * from buy,user,good " +
            "where buy.uid=user.uid" +
            "  and good.gid=buy.gid and gname=#{gname}")
    List<Buy> selectByGname(@Param("gname") String gname);

    @Select("select * from buy,user,good " +
            "where buy.uid=user.uid" +
            " and good.gid=buy.gid and " +
            "sid=#{sid}")
    List<Buy> selectBySid(@Param("sid") int sid);

    @Select("select * from buy,user,good " +
            "where buy.uid=user.uid " +
            " and good.gid=buy.gid " +
            " and username=#{username}")
    List<Buy> selectByUsername(@Param("username") String username);

//    @Select("select * from sell where gid = #{gid} and sid=#{sid}")
//    Sell selectById(@Param("gid") int gid,@Param("sid") int sid);

//    @Delete("delete from sell where gid = #{gid} and sid=#{sid}")
//    int delSeById(@Param("gid") int gid,@Param("sid") int sid);

    @Insert("insert into buy (gid,sid,uid,number)" +
            "value(#{gid},#{sid},#{uid},#{number})")
    int addBuy(Buy buy);
//
//    @Update("update sell set gid=#{gid},sid=#{sid} ,stock=#{stock},price=#{price} where gid=#{gid}" +
//            "and sid=#{sid}")
//    int updateSubmit(Sell sell);
}
