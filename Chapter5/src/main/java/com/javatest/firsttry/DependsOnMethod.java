package com.javatest.firsttry;

import org.testng.annotations.Test;

public class DependsOnMethod {

//    @Test
//    public void test1(){
//        System.out.println("test1 running!");
//    }

    @Test
    public void test1(){
        throw new RuntimeException();
    }

    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 running!");
    }
}
