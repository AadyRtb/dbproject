package com.example.controller;

import com.example.model.Owner;
import com.example.model.User;
import com.example.service.OwnerService;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/us")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/selectAll")
    public String getAllUs(Model model){
        List<User> userList = userService.selectAllUs();
        model.addAttribute("us_info",userList);
        //  System.out.println(studentList);
        return "us/usInfo";
    }

    @RequestMapping("/selectById")
    public String getUsByUid(Model model,int uid){
        User user = userService.selectById(uid);
        model.addAttribute("ous",user);
        // System.out.println(student);
        return "us/oneUs";
    }
    @RequestMapping("/delUsByUid")
    public String delUsByUid(int uid){
        // System.out.println("id="+idstudent);
        int i= userService.delUsByUid(uid);
        // System.out.println("i="+i);
        return  "redirect:/us/selectAll";
    }
    @RequestMapping("/addUs")
    public String addUs(User user){
        // System.out.println(student);
        int i=userService.addUs(user);

        return "redirect:/us/selectAll";
    }
    @RequestMapping("/updateByUid")
    public String updateByUid(int uid,Model model){
        //System.out.println(idstudent);
        User us = userService.selectById(uid);
        model.addAttribute("us",us);
        return "us/editUs";
    }
    @RequestMapping("/updateSubmit")
    public String updateSubmit(User user){
        // System.out.println("修改提交="+student);
        userService.updateSubmit(user);
        return "redirect:selectAll";
    }
}

