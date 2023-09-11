package com.example.service;

import com.example.model.Good;
import com.example.model.Sell;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface SellService {

    List<Sell> selectAllSe();


    List<Sell> selectByGname(String gid);


    List<Sell> selectBySid(int sid);


    Sell selectById(int gid, int sid);


    int delSeById(int gid,int sid);


    int addSell(Sell sell);


    int updateSubmit(Sell sell);
}
