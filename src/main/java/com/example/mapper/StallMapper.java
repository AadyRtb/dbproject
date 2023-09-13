package com.example.mapper;


import com.example.model.Owner;
import com.example.model.Stall;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StallMapper {
    @Select("select * from stall")
    List<Stall> selectAllSta();

    @Select("select * from stall where sid=#{sid}")
    Stall selectById(@Param("sid") int sid);

    @Select("select * from stall x where x.income = (select MAX(income) from stall)")
    Stall selectMost();

    @Select("select * from owner where oid=#{oid}")
    Owner selectByOid(@Param("oid") int oid);

    @Delete("delete from stall where sid = #{sid}")
    int delStaBySid(@Param("sid") int sid);

    @Insert("insert into stall(oid,state,income) " +
            "value(#{oid},#{state},#{income})")
    int addStall(Stall stall);

    @Update("update stall set oid=#{oid},state=#{state},income=#{income} where sid=#{sid}")
    int updateSubmit(Stall stall);
}
