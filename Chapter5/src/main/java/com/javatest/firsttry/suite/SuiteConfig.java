package com.javatest.firsttry.suite;

import org.testng.annotations.*;

public class SuiteConfig {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforesuit running!");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("aftersuit running!");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("beforetest running1");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("aftertest running!");
    }
}
