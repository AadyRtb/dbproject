package com.example.service;

import com.example.model.Stall;

import java.util.List;

public interface StallService {
    List<Stall> selectAllSta();

    Stall selectById(int sid);

    int delStaBySid(int sid);

    int addSta(Stall stall);

    int updateSubmit(Stall stall);
}
