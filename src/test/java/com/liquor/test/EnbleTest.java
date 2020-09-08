package com.liquor.test;

import org.testng.annotations.Test;

public class EnbleTest {

    @Test
    public void test1(){
        System.out.println("@Test");
    }

    @Test(enabled = false)
    public void test2(){
        System.out.println("@Test enabled");
    }
}
