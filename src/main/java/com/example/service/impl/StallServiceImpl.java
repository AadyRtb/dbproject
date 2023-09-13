package com.example.service.impl;


import com.example.mapper.StallMapper;
import com.example.model.Owner;
import com.example.model.Stall;
import com.example.service.StallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StallServiceImpl implements StallService {
    @Autowired
    private StallMapper stallMapper;

    @Override
    public List<Stall> selectAllSta(){
        return stallMapper.selectAllSta();
    }
    @Override
    public Stall selectById(int sid){
        return stallMapper.selectById(sid);
    }


    @Override public  Stall selectMost(){return  stallMapper.selectMost();}
    @Override
    public  Owner selectByOid(int oid)  {return stallMapper.selectByOid(oid);}

    @Override
    public int delStaBySid(int sid) {
        return stallMapper.delStaBySid(sid);
    }

    @Override
    public int addSta(Stall stall) {
        return stallMapper.addStall(stall);
    }

    @Override
    public int updateSubmit(Stall stall) {
        return stallMapper.updateSubmit(stall);
    }
}
