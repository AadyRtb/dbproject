package com.example.controller;

import com.example.model.Owner;
import com.example.model.Stall;
import com.example.service.OwnerService;
import com.example.service.StallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/sta")
public class StallController {
    @Autowired
    private StallService stallService;
    @RequestMapping("/selectAll")
    public String getAllSta(Model model){
        List<Stall> stallList = stallService.selectAllSta();
        model.addAttribute("sta_info",stallList);
        //  System.out.println(studentList);
        return "sta/staInfo";
    }

    @RequestMapping("/selectBySid")
    public String getStaBySid(Model model,int sid){
        Stall stall = stallService.selectById(sid);
        model.addAttribute("osta",stall);
        // System.out.println(student);
        return "sta/oneSta";
    }

    @RequestMapping("/selectByOid")
    public String geStaByOid(Model model,int sid){
        Stall stall =stallService.selectById(sid);
        int oid=stall.getOid();
        Owner owner= stallService.selectByOid(oid);
        model.addAttribute("oow",owner);
        return "sta/oneOw";
    }
    @RequestMapping("/delStaBySid")
    public String delStaBySid(int sid){
        // System.out.println("id="+idstudent);
        int i= stallService.delStaBySid(sid);
        // System.out.println("i="+i);
        return  "redirect:/sta/selectAll";
    }
    @RequestMapping("/addSta")
    public String addSta(Stall stall){
        // System.out.println(student);
        int i=stallService.addSta(stall);

        return "redirect:/sta/selectAll";
    }
    @RequestMapping("/updateBySid")
    public String updateBySid(int sid,Model model){
        //System.out.println(idstudent);
        Stall sta=stallService.selectById(sid);
        model.addAttribute("sta",sta);
        return "sta/editSta";
    }
    @RequestMapping("/updateSubmit")
    public String updateSubmit(Stall stall){
        // System.out.println("修改提交="+student);
        stallService.updateSubmit(stall);
        return "redirect:selectAll";
    }
}

