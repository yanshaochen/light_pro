package com.giit.controller;

import com.giit.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class UserInfoController {
    @Resource(name = "userService")
    private IUserService userService;
}
