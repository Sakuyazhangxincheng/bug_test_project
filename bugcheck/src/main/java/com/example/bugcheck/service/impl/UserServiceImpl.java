package com.example.bugcheck.service.impl;

import com.example.bugcheck.mapper.UserMapper;
import com.example.bugcheck.pojo.table.User;
import com.example.bugcheck.pojo.table.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public User registerUser(User user) {
        // 判断是否已存在该用户
        UserExample userExample = new UserExample();
        userExample.createCriteria().andNameEqualTo(user.getName());
        List<User> userList = userMapper.selectByExample(userExample);
        if (!userList.isEmpty())
        {
            return null;
        }

        // 否则注册为新的用户
        userMapper.insert(user);

        /* 成功后告知对方已成功注册 */
        //emailService.sendSimpleMail(user.getEmail() , "Register Notice" , "Register successfully! Welcome to use our products, if you have any " +
        //        "comments, please feel free to feedback, we will actively improve, thank you.");

        return user;
    }

    @Override
    public User loginUser(String name, String password) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andPasswordEqualTo(password).andNameEqualTo(name);
        List<User> users =userMapper.selectByExample(userExample);
        if(users!=null){
            if(users.size()==1) return users.get(0);
            else return null;
        }
        else return null;
    }
}
