package com.example.controller;

import com.example.model.Good;
import com.example.model.Sell;
import com.example.service.SellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/se")
public class SellController {
    @Autowired
    private SellService sellService;

    @RequestMapping("/selectAll")
    public String getAllGo(Model model){
        List<Sell> sellList = sellService.selectAllSe();
        model.addAttribute("se_info",sellList);
        return "se/seInfo";
    }

    @RequestMapping("/selectById")
    public String getSeById(Model model,int gid,int sid){
        Sell sell = sellService.selectById(gid,sid);
        model.addAttribute("ose",sell);
        return "se/oneSe";
    }

    @RequestMapping("/selectByGname")
    public String getSeByGid(Model model,String gname){
        List<Sell> selllist = sellService.selectByGname(gname);
        model.addAttribute("se_info",selllist);
        return "se/seInfo";
    }

    @RequestMapping("/selectBySid")
    public String getSeBySid(Model model,int sid){
        List<Sell> sellist = sellService.selectBySid(sid);
        model.addAttribute("se_info",sellist);
        return "se/seInfo";
    }




    @RequestMapping("/delSeById")
    public String delSeById(int gid,int sid){
        // System.out.println("id="+idstudent);
        int i= sellService.delSeById(gid,sid);
        // System.out.println("i="+i);
        return  "redirect:/se/selectAll";
    }
    @RequestMapping("/addSe")
    public String addSe(Sell sell){
        // System.out.println(student);
        int i=sellService.addSell(sell);
        // System.out.println("i="+i);
        return "redirect:/se/selectAll";
    }
    @RequestMapping("/updateById")
    public String updateByGid(int gid,int sid,Model model){

        Sell se=sellService.selectById(gid,sid);
        model.addAttribute("se",se);
        return "se/editSe";
    }
    @RequestMapping("/updateSubmit")
    public String updateSubmit(Sell sell){
        // System.out.println("修改提交="+student);
       sellService.updateSubmit(sell);
        return "redirect:selectAll";
    }
}
