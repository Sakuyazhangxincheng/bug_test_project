package com.example.bugcheck.utils;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class GlobalTest {

    GlobalTest globalTest;
    @BeforeEach
    void setUp() {
        globalTest = new GlobalTest();
        System.out.println("test prepare is finished");
    }

    @AfterEach
    void tearDown() {
        System.out.println("test finisher");
        globalTest=null;
    }
}