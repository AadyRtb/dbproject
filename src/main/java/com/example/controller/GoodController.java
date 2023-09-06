package com.example.controller;

import com.example.model.Good;
import com.example.model.Stall;
import com.example.service.GoodService;
import com.example.service.StallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/go")
public class GoodController {
    @Autowired
    private GoodService goodService;
    @RequestMapping("/selectAll")
    public String getAllGo(Model model){
        List<Good> goodList = goodService.selectAllGo();
        model.addAttribute("go_info",goodList);
        //  System.out.println(studentList);
        return "go/goInfo";
    }

    @RequestMapping("/selectById")
    public String getGoByGid(Model model,int gid){
        Good good = goodService.selectById(gid);
        model.addAttribute("ogo",good);
        // System.out.println(student);
        return "go/oneGo";
    }

    @RequestMapping("/selectByType")
    public String getGoByType(Model model,String type){
        List<Good> goodlist = goodService.selectByType(type);
        model.addAttribute("go_info",goodlist);
        return "go/goInfo";
    }
    @RequestMapping("/delStaByGid")
    public String delGoByGid(int gid){
        // System.out.println("id="+idstudent);
        int i= goodService.delGoByGid(gid);
        // System.out.println("i="+i);
        return  "redirect:/go/selectAll";
    }
    @RequestMapping("/addGo")
    public String addGo(Good good){
        // System.out.println(student);
        int i=goodService.addGo(good);

        return "redirect:/go/selectAll";
    }
    @RequestMapping("/updateByGid")
    public String updateByGid(int gid,Model model){
        //System.out.println(idstudent);
        Good go=goodService.selectById(gid);
        model.addAttribute("go",go);
        return "go/editGo";
    }
    @RequestMapping("/updateSubmit")
    public String updateSubmit(Good good){
        // System.out.println("修改提交="+student);
        goodService.updateSubmit(good);
        return "redirect:selectAll";
    }
}
