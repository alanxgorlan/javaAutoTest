package com.javatest.firsttry.multiThread;

import org.testng.annotations.Test;

public class MultiThreadOnXML {
    @Test
    public void multiThreadTest1(){
        System.out.printf("Test1's Thread ID is:%s%n",Thread.currentThread().getId());
    }

    @Test
    public void multiThreadTest2(){
        System.out.printf("Test2's Thread ID is:%s%n",Thread.currentThread().getId());
    }

    @Test
    public void multiThreadTest3(){
        System.out.printf("Test3's Thread ID is:%s%n",Thread.currentThread().getId());
    }
}
