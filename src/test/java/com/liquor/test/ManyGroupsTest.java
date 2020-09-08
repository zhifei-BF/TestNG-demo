package com.liquor.test;

import org.testng.annotations.*;

public class ManyGroupsTest {
    @Test(groups = {"a","b"})
    public void test0(){
        System.out.println("@Test");
    }

    @BeforeGroups(groups = "a")
    public void testa1(){
        System.out.println("@BeforeGroups a");
    }

    @AfterGroups(groups = "a")
    public void testa2(){
        System.out.println("@AfterGroups a");
    }
    @BeforeGroups(groups = "b")
    public void testb1(){
        System.out.println("@BeforeGroups b");
    }

    @AfterGroups(groups = "b")
    public void testb2(){
        System.out.println("@AfterGroups b");
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
