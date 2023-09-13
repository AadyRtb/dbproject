package com.example.service.impl;

import com.example.mapper.BuyMapper;
import com.example.mapper.GoodMapper;
import com.example.model.Buy;
import com.example.model.Sell;
import com.example.service.BuyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuyServiceImpl implements BuyService {
    @Autowired
    private BuyMapper buyMapper;

    @Override
    public List<Buy> selectAllBu(){
        return  buyMapper.selectAllBu();
    }


    @Override
    public  List<Buy> selectByGname(String gname){
        return buyMapper.selectByGname(gname);
    }


    @Override
    public List<Buy> selectBySid(int sid){
        return buyMapper.selectBySid(sid);
    }

    @Override
    public List<Buy> selectByUsername(String username){
        return buyMapper.selectByUsername(username);
    }


//    Sell selectById(int gid, int sid);


//    int delSeById(int gid,int sid);


    @Override
    public int addBuy(Buy buy){
        return  buyMapper.addBuy(buy);
    }


//    int updateSubmit(Sell sell);
}
