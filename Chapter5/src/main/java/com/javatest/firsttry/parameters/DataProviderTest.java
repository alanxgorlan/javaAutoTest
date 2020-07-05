package com.javatest.firsttry.parameters;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {
    @Test(dataProvider = "data")
    public void testDataProvider(String name,int age){
        System.out.println("name=" + name +" ;age=" + age);
    }

    @DataProvider(name = "data")
    public Object[][] providerData(){
        Object[][] o = new Object[][]{
                {"Sam",10},
                {"Tom",20}
        };
        return o;
    }

    //使用Method来区分方法，从而为多个方法提供参数
    @Test(dataProvider = "methodtest")
    public void test1(String name,int age){
        System.out.println("test1 name=" + name +" ;age=" + age );
    }

    @Test(dataProvider = "methodtest")
    public void test2(String name,int age){
        System.out.println("test2 name=" + name +" ;age=" + age );
    }

    @DataProvider(name = "methodtest")
    public Object[][] methodTest(Method method){
        Object[][] res =null;

        if(method.getName().equals("test1")){
            res = new Object[][]{
                    {"FFFFFF",30}
            };
        }else if (method.getName().equals("test2")){
            res = new Object[][]{
                    {"OOOOOO",30}
            };
        }

        return res;

    }
}
