package com.example.service.impl;


import com.example.mapper.SellMapper;
import com.example.model.Good;
import com.example.model.Sell;
import com.example.service.SellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellServiceImpl implements SellService {
    @Autowired
    private SellMapper sellMapper;


    @Override
    public List<Sell> selectAllSe() {
        return sellMapper.selectAllSe();
    }

    @Override
    public List<Sell> selectByGname(String gname) {
        return sellMapper.selectByGname(gname);
    }

    @Override
    public List<Sell> selectBySid(int sid) {
        return sellMapper.selectBySid(sid);
    }

    @Override
    public Sell selectById(int gid, int sid) {
        return sellMapper.selectById(gid,sid);
    }

    @Override
    public int delSeById(int gid, int sid) {
        return sellMapper.delSeById(gid,sid);
    }

    @Override
    public int addSell(Sell sell) {
        return sellMapper.addSell(sell);
    }

    @Override
    public int updateSubmit(Sell sell) {
        return sellMapper.updateSubmit(sell);
    }
}
