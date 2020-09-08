package com.liquor.test;

import org.testng.annotations.Test;

public class ExceptedTest {
    @Test(expectedExceptions  = ArithmeticException.class)
    public void test1(){
        System.out.println("算术异常！");
        int i = 12 / 0;
        System.out.println("除0异常！");
    }
}
