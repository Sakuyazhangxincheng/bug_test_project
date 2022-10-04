package com.example.bugcheck.service.impl;

import com.example.bugcheck.mapper.UserMapper;
import com.example.bugcheck.pojo.table.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataService implements DataServiceImpl{

    @Autowired
    private UserMapper userMapper;

    public double result(List<Data> data){
        double accuracy=0;





        
        return accuracy;
    }

}
