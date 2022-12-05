package com.example.bugcheck.utils;

import com.alibaba.testable.core.annotation.MockInvoke;
import com.alibaba.testable.core.annotation.MockNew;
import com.example.bugcheck.BugcheckApplication;
import com.example.bugcheck.pojo.table.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

//@SpringBootTest
public class CodeTest {


    private Code code=new Code();
    private String email="1449722625";
    private String codeValue="12313";


    public static class Mock {
        @MockNew
        private Code createCode(){
            return new Code();
        }

        @MockInvoke(targetClass = Code.class,targetMethod = "getUsername")
        private String getUsername(){
            return "123123123";
        }
        private void setUsername(){
            System.out.println("123123123");
        }
    }

    @BeforeEach
    void setUp() {
        code.setUsername(email);
        code.setCodeValue(codeValue);
        System.out.println("test prepare is finished");
    }

    @AfterEach
    void tearDown() {
        code=null;
    }

    @Test
    void setUsername() {
        //code.setUsername("123");

        assertEquals("123123",new Code().getUsername());
    }

    @Test
    void getUsername() {
        assertEquals(email,code.getUsername());
    }

    @Test
    void setCodeValue() {
        code.setCodeValue(codeValue);
        assertEquals(codeValue,code.getCodeValue());
    }

    @Test
    void getCodeValue() {
        assertEquals(codeValue,code.getCodeValue());
    }


    @Test
    void setEmail() {
        code.setUsername(email);
        assertEquals(email,code.getUsername());
    }

    @Test
    void getEmail() {
        assertEquals(email,code.getUsername());
    }


}