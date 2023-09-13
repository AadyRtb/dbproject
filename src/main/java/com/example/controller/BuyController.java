package com.example.controller;

import com.example.mapper.BuyMapper;
import com.example.model.Buy;
import com.example.model.Sell;
import com.example.service.BuyService;
import com.example.service.SellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/bu")
public class BuyController {
    @Autowired
    private BuyService buyService;

    @RequestMapping("/selectAll")
    public String getAllBu(Model model){
        List<Buy> buyList = buyService.selectAllBu();
        model.addAttribute("bu_info",buyList);
        return "bu/buInfo";
    }

//    @RequestMapping("/selectById")
//    public String getBuById(Model model,int gid,int sid){
//        Sell sell = sellService.selectById(gid,sid);
//        model.addAttribute("ose",sell);
//        return "se/oneSe";
//    }

    @RequestMapping("/selectByGname")
    public String getBuByGid(Model model,String gname){
        List<Buy> buylist = buyService.selectByGname(gname);
        model.addAttribute("bu_info",buylist);
        return "bu/buInfo";
    }

    @RequestMapping("/selectBySid")
    public String getBUBySid(Model model,int sid){
        List<Buy> buyist = buyService.selectBySid(sid);
        model.addAttribute("bu_info",buyist);
        return "bu/buInfo";
    }

    @RequestMapping("/selectByUsername")
    public  String getBuByUsername(Model model,String username){
        List<Buy> buyList = buyService.selectByUsername(username);
        model.addAttribute("bu_info",buyList);
        return "bu/buInfo";
    }

    @RequestMapping("/addBu")
    public String addBu(Buy buy){
        // System.out.println(student);
        int i=buyService.addBuy(buy);
        // System.out.println("i="+i);
        return "redirect:/bu/selectAll";
    }
}
