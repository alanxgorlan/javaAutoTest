package com.javatest.firsttry.groups;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsTest {
    @Test(groups = "server")
    public void serverTest(){
        System.out.println("It's server!");
    }

    @Test(groups = "client")
    public void clientTest(){
        System.out.println("It's client!");
    }

    @BeforeGroups("server")
    public void beforeGroups(){
        System.out.println("beforegroups!");
    }
}
