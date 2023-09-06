package com.example.service;

import com.example.model.Owner;
import com.example.model.Stall;

import java.util.List;

public interface StallService {
    List<Stall> selectAllSta();

    Stall selectById(int sid);

    Owner selectByOid(int oid);

    int delStaBySid(int sid);

    int addSta(Stall stall);

    int updateSubmit(Stall stall);
}
