package com.example.bugcheck.service.impl;


import com.example.bugcheck.pojo.table.Data;

import java.util.List;

public interface DataServiceImpl {

    // 输入的是装有 Data列表， 每一个Data对应的是一行数据。 如需要调用第五行的参数例如ID：： data[4].getId
    // 都可以在Data类里面寻找到对应函数
    // 修改数据库里的内容将使用 DataExample 类
    double result(List<Data> data);
}
