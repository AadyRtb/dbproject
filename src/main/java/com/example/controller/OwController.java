package com.example.controller;


import com.example.model.Owner;
import com.example.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/ow")
public class OwController {
    @Autowired
    private OwnerService ownerService;
    @RequestMapping("/selectAll")
    public String getAllOw(Model model){
        List<Owner> ownerList = ownerService.selectAllOw();
        model.addAttribute("ow_info",ownerList);
      //  System.out.println(studentList);
        return "ow/owInfo";
    }

    @RequestMapping("/selectById")
    public String getOwByOid(Model model,int oid){
        Owner owner = ownerService.selectById(oid);
        model.addAttribute("oow",owner);
       // System.out.println(student);
        return "ow/oneOw";
    }
    @RequestMapping("/delOwByOid")
    public String delOwByOid(int oid){
       // System.out.println("id="+idstudent);
        int i= ownerService.delOwByOid(oid);
       // System.out.println("i="+i);
        return  "redirect:/ow/selectAll";
    }
    @RequestMapping("/addOw")
    public String addOw(Owner owner){
       // System.out.println(student);
        int i=ownerService.addOw(owner);

        return "redirect:/ow/selectAll";
    }
    @RequestMapping("/updateByOid")
    public String updateByOid(int oid,Model model){
        //System.out.println(idstudent);
       Owner ow = ownerService.selectById(oid);
        model.addAttribute("ow",ow);
        return "ow/editOw";
    }
    @RequestMapping("/updateSubmit")
    public String updateSubmit(Owner owner){
       // System.out.println("修改提交="+student);
        ownerService.updateSubmit(owner);
        return "redirect:selectAll";
    }
}
