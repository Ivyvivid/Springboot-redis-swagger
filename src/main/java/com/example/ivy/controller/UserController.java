package com.example.ivy.controller;

import com.example.ivy.entity.User;
import com.example.ivy.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Api(value = "用户信息",tags = {"用户信息"})
@Controller
@RequestMapping(value = "/uesr")
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping("/add")
    @ApiOperation(value = "添加用户")
    public void add(User user) {
        service.add(user);
    }


}
