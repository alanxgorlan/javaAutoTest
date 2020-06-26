package com.javatest.firsttry;

import org.testng.annotations.Test;

public class ExceptedException {
    @Test(expectedExceptions = RuntimeException.class)
    public void expectedExceptionTest(){
        System.out.println("捕捉到了异常！");
        throw new RuntimeException();
    }
}
