package com.example.service.impl;

import com.example.mapper.OwnerMapper;
import com.example.model.Owner;
import com.example.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerServiceImpl implements OwnerService {
    @Autowired
    private OwnerMapper ownerMapper;

    @Override
    public List<Owner> selectAllOw(){
       return ownerMapper.selectAllOw();
    }
    @Override
    public Owner selectById(int oid){
        return ownerMapper.selectById(oid);
    }

    @Override
    public int delOwByOid(int oid) {
        return ownerMapper.delOwByOid(oid);
    }

    @Override
    public int addOw(Owner owner) {
        return ownerMapper.addOwner(owner);
    }

    @Override
    public int updateSubmit(Owner owner) {
        return ownerMapper.updateSubmit(owner);
    }
}
