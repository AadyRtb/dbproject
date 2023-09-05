package com.example.service.impl;

import com.example.mapper.OwnerMapper;
import com.example.mapper.UserMapper;
import com.example.model.Owner;
import com.example.model.User;
import com.example.service.OwnerService;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectAllUs(){
        return userMapper.selectAllUs();
    }
    @Override
    public User selectById(int uid){
        return userMapper.selectById(uid);
    }

    @Override
    public int delUsByUid(int uid) {
        return userMapper.delUsByUid(uid);
    }

    @Override
    public int addUs(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public int updateSubmit(User user) {
        return userMapper.updateSubmit(user);
    }
}
