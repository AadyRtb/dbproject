package com.example.service;

import com.example.model.Owner;
import com.example.model.User;

import java.util.List;

public interface UserService {
    List<User> selectAllUs();
    User selectById(int uid);


    int delUsByUid(int uid);

    int addUs(User user);

    int updateSubmit(User user);
}
