package com.liquor.test;

import org.testng.annotations.*;

public class GroupsTest {
    @Test(groups = "a")
    public void test0(){
        System.out.println("@Test");
    }

    @BeforeGroups(groups = "a")
    public void test1(){
        System.out.println("@BeforeGroups ");
    }

    @AfterGroups(groups = "a")
    public void test2(){
        System.out.println("@AfterGroups ");
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
