package com.example.service;

import com.example.model.Good;
import com.example.model.Stall;

import java.util.List;

public interface GoodService {
    List<Good> selectAllGo();

    Good selectById(int gid);
    List<Good> selectByType(String type);

    int delGoByGid(int gid);

    int addGo(Good good);

    int updateSubmit(Good good);

}
