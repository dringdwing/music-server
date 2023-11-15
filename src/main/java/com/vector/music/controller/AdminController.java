package com.vector.music.controller;

import com.alibaba.fastjson.JSONObject;
import com.vector.music.service.AdminService;
import com.vector.music.utils.Consts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
public class AdminController {

    /**
     * 会根据AdminService找到其实现类
     */
    @Autowired
    private AdminService adminService;

    /**
     * 判断是否成功
     */
    @PostMapping("/admin/login/status")
    public Object loginStatus(HttpServletRequest request, HttpSession session){
        JSONObject jsonpObject = new JSONObject();
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        boolean flag = adminService.verifyPassword(name, password);
        if(flag){
            jsonpObject.put(Consts.CODE, 1);
            jsonpObject.put(Consts.MSG, "Login successful!");
            session.setAttribute(Consts.NAME,name);
            return jsonpObject;
        }
        jsonpObject.put(Consts.CODE,0);
        jsonpObject.put(Consts.MSG,"Account error!");
        return jsonpObject;
    }
}
