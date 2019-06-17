package com.pwl.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pwl.UserService;
import com.pwl.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping(value = "getUser", method = RequestMethod.GET)
    @ResponseBody
    public String getUser(){
        return userService.sayHello("哈哈");
    }

    @RequestMapping(value = "queryAll", method = RequestMethod.GET)
    @ResponseBody
    public List<User> queryAll(){
        return userService.queryAll();
    }

}
