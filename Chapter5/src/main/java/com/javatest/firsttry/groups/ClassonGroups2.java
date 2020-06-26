package com.javatest.firsttry.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class ClassonGroups2 {
    public void teacherPrint(){
        System.out.println("I'm ur teacher!!!");
    }
}
