package com.example.bugcheck.service.impl;

import com.example.bugcheck.mapper.UserMapper;
import com.example.bugcheck.pojo.table.User;
import com.example.bugcheck.pojo.table.UserExample;
import com.example.bugcheck.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.example.bugcheck.utils.Global.*;

@Service
public class UserServiceImpl implements UserService {

    //自动 new 分配
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
        user.setId(listUser().size()+1);
        // 否则注册为新的用户
        userMapper.insert(user);

        /* 成功后告知对方已成功注册 */
        //emailService.sendSimpleMail(user.getEmail() , "Register Notice" , "Register successfully! Welcome to use our products, if you have any " +
        //        "comments, please feel free to feedback, we will actively improve, thank you.");

        return user;
    }

    @Override
    public int loginUser(String name, String password) {
        UserExample userExample2 = new UserExample();
        userExample2.createCriteria().andNameEqualTo(name);
        UserExample userExample3 = new UserExample();
        userExample3.createCriteria().andPasswordEqualTo(password);
        List<User> users2 =userMapper.selectByExample(userExample2);
        List<User> users3 =userMapper.selectByExample(userExample3);

        UserExample userExample = new UserExample();
        userExample.createCriteria().andPasswordEqualTo(password).andNameEqualTo(name);
        List<User> users =userMapper.selectByExample(userExample);
        if(users.size()!=0){
            if(users.size()==1)
            {
                return SUCCESS;
            }

            else
            {
                return FAIL;
            }
        }
        else if(users2.size()!=0){
            return WRONGPASSWORD;
        }
        else if(users3.size()!=0){
            return WRONGNAME;
        }
        else
        {
            return FAIL;
        }
    }

    @Override
    public List<User> listUser() {
        return userMapper.selectByExample(null);
    }

    @Override
    public int changeEmail(String username, String email) {
        UserExample userExample=new UserExample();
        userExample.createCriteria().andNameEqualTo(username);
        List<User> users =userMapper.selectByExample(userExample);
        User user=users.get(0);
        user.setEmail(email);
        userMapper.updateByExample(user,userExample);
        return SUCCESS;
    }

    @Override
    public double changePassword(String username, String password) {
        UserExample userExample=new UserExample();
        userExample.createCriteria().andNameEqualTo(username);
        List<User> users =userMapper.selectByExample(userExample);
        User user=users.get(0);
        user.setPassword(password);
        userMapper.updateByExample(user,userExample);
        return SUCCESS;
    }

}
