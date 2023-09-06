package com.example.service.impl;

import com.example.mapper.GoodMapper;
import com.example.mapper.StallMapper;
import com.example.model.Good;
import com.example.model.Stall;
import com.example.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodServiceImpl implements GoodService {
    @Autowired
    private GoodMapper goodMapper;

    @Override
    public List<Good> selectAllGo(){
        return goodMapper.selectAllGo();
    }

    @Override
    public Good selectById(int gid){
        return goodMapper.selectById(gid);
    }

    @Override
    public List<Good> selectByType(String type) {return goodMapper.selectByType(type);}
    @Override
    public int delGoByGid(int gid) {
        return goodMapper.delGoByGid(gid);
    }

    @Override
    public int addGo(Good good) {
        return goodMapper.addGood(good);
    }

    @Override
    public int updateSubmit(Good good) {
        return goodMapper.updateSubmit(good);
    }
}
