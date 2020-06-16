package com.javatest.firsttry;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class BasicAnnotation {
    //TestNG最基本的注解
    @Test
    public void testCase1() {
        System.out.println("这是测试用例1");
    }

    @Test
    public void testCase2() {
        System.out.println("这是测试用例2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod是在测试方法之前运行的！");

    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod是在测试方法之后运行的！");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before");
    }
}
