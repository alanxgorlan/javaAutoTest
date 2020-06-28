package com.javatest.firsttry.parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {

    @Test
    @Parameters({"name","age"})
    public void parametersTest(String name,int age){
        System.out.println("The name is "+name+"; Age is "+age);
    }
}
