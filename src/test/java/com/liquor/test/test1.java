package com.liquor.test;

import org.testng.annotations.*;

public class test1 {
    @Test
    public void test1(){
        System.out.println("@Test");
    }

    @BeforeClass
    public void BeforeClassTest(){
        System.out.println("@BeforeClassTest");
    }

    @AfterClass
    public void AfterClassTest(){
        System.out.println("@AfterClassTest");
    }

    @BeforeMethod
    public void BeforeMethodTest(){
        System.out.println("@BeforeMethod");
    }

    @AfterMethod
    public void AfterMethodTest(){
        System.out.println("@AfterMethod");
    }



}
