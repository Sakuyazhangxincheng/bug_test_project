package com.example.bugcheck.controller;

import com.example.bugcheck.pojo.table.User;
import com.example.bugcheck.service.impl.DataService;
import com.example.bugcheck.service.impl.UserService;
import com.example.bugcheck.utils.ReturnObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import static com.example.bugcheck.utils.Global.SUCCESS;


@Controller
public class UserController {

    @Autowired
    private DataService dataService;
    @Autowired
    private UserService userService;

    @GetMapping("/index")
    @ResponseBody
    public ReturnObject<User> register(User user, @RequestParam("code")String codeValue){
        return new ReturnObject<>(SUCCESS, user);
    }
}
