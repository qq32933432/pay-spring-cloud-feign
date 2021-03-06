package com.bxoon.controller;

import com.bxoon.bean.PayUser;
import com.bxoon.dao.PayUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private PayUserDao dao;

    @Value("${myww}")
    private  String myww;

    @RequestMapping("/")
    @ResponseBody
    String home() {
        try {
            List<PayUser> list = dao.findAll();
            System.out.println(list.size());
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        return myww;
    }

    @RequestMapping("/home2")
    @ResponseBody
    String home2() {
        try {
            List<PayUser> list=dao.findAll();
            System.out.println(list.size());
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        return "Hello World2222222!";
    }

}
