package com.liquor.test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteTest {
    @BeforeSuite
    public void test1(){
        System.out.println("BeforeSuite");
    }

    @AfterSuite
    public void test2(){
        System.out.println("AfterSuite");
    }

    @Test
    public void test(){
        System.out.println("Test");
    }
}
