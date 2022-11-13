package com.example.bugcheck.utils;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReturnObjectTest {

    ReturnObjectTest returnObjectTest;
    @BeforeEach
    void setUp() {
        returnObjectTest =new ReturnObjectTest();
        System.out.println("test prepare is finished");
    }

    @AfterEach
    void tearDown() {
        System.out.println("test finisher");
        returnObjectTest =null;
    }

    @Test
    void getObject() {
    }

    @Test
    void setObject() {
    }

    @Test
    void getCode() {
    }

    @Test
    void setCode() {
    }
}