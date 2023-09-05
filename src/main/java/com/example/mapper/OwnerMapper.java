package com.example.mapper;


import com.example.model.Owner;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface OwnerMapper {
    @Select("select * from owner")
    List<Owner> selectAllOw();

    @Select("select * from owner where oid=#{oid}")
    Owner selectById(@Param("oid") int oid);


    @Delete("delete from owner where oid = #{oid}")
    int delOwByOid(@Param("oid") int oid);

    @Insert("insert into owner(oname,ophone) " +
            "value(#{oname},#{ophone})")
    int addOwner(Owner owner);

    @Update("update owner set oname=#{oname},ophone=#{ophone} where oid=#{oid}")
    int updateSubmit(Owner owner);
}
