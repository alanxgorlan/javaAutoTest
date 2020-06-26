package com.javatest.firsttry.groups;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class MethodonGoups {
    @AfterTest(groups = "server")
    public void serverTest(){
        System.out.println("It's server!");
    }

    @Test(groups = "client")
    public void clientTest(){
        System.out.println("It's client!");
    }

    @BeforeGroups("client")
    public void beforeGroups(){
        System.out.println("beforegroups!");
    }
}
