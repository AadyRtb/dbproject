package com.example.service;

import com.example.model.Buy;
import com.example.model.Sell;

import java.util.List;

public interface BuyService {

    List<Buy> selectAllBu();


    List<Buy> selectByGname(String gname);


    List<Buy> selectBySid(int sid);

    List<Buy> selectByUsername(String username);

    int addBuy(Buy buy);

}
