package com.javatest.firsttry.groups;

import org.testng.annotations.Test;

@Test(groups = "student")
public class ClassonGroups {
    public void stuPrint(){
        System.out.println("I'm stu!!!");
    }
}
