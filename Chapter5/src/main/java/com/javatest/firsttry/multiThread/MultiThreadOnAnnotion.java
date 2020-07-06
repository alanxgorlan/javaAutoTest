package com.javatest.firsttry.multiThread;

import org.testng.annotations.Test;

public class MultiThreadOnAnnotion {
    @Test(invocationCount = 10,threadPoolSize = 3)
    public void multiThreadTest(){
        System.out.println(1);
        System.out.printf("Thread ID is:%s%n",Thread.currentThread().getId());
    }
}
