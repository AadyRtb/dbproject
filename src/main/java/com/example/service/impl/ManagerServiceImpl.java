package com.example.service.impl;

import com.example.mapper.ManagerMapper;
import com.example.model.Manager;
import com.example.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    private ManagerMapper managerMapper;



    @Override
    public Manager log(String mname, String password) {
        return managerMapper.log(mname,password);
    }
}
