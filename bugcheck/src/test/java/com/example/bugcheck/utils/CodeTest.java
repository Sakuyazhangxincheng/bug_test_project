package com.example.bugcheck.utils;

import com.example.bugcheck.BugcheckApplication;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CodeTest {

    CodeTest codeTest;
    @BeforeEach
    void setUp() {
        codeTest=new CodeTest();
        System.out.println("test prepare is finished");
    }

    @AfterEach
    void tearDown() {
        System.out.println("test finisher");
        codeTest=null;
    }

    @Test
    void getUsername() {
    }

    @Test
    void setUsername() {
    }

    @Test
    void getCodeValue() {
    }

    @Test
    void setCodeValue() {
    }

    @Test
    void getEmail() {
    }

    @Test
    void setEmail() {
    }
}