package com.example.bugcheck;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BugcheckApplicationTest {

    BugcheckApplication bugcheckApplication;
    @BeforeEach
    void setUp() {
        bugcheckApplication=new BugcheckApplication();
        System.out.println("test prepare is finished");
    }

    @AfterEach
    void tearDown() {
        System.out.println("test finisher");
        bugcheckApplication=null;
    }

    @Test
    void main() {
    }
}