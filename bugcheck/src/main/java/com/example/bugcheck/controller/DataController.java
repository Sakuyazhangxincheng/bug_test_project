package com.example.bugcheck.controller;

import com.example.bugcheck.pojo.table.User;
import com.example.bugcheck.service.DataService;
import com.example.bugcheck.service.UserService;
import com.example.bugcheck.utils.Global;
import com.example.bugcheck.utils.ReturnObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import static com.example.bugcheck.utils.Global.SUCCESS;

@Controller
public class DataController {

    @Autowired
    private DataService dataService;

    @PostMapping("/upload")
    @ResponseBody
    public String draftContract(MultipartFile upload,String algorithm)
    {
        System.out.println("123");
        dataService.addFile(upload);
        dataService.write(upload);
        double data[][] =dataService.data();
        double result=dataService.logicalRegression(data);
        System.out.println("result");
        return String.valueOf(result);
    }



}

