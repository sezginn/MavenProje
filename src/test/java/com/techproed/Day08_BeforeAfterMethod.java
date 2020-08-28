package com.techproed;

import org.junit.*;

public class Day08_BeforeAfterMethod {

    @BeforeClass
    public static void setUp(){
        System.out.println("Teardown calisti.");
    }

    @Before
    public void MethoddanOnce(){
        System.out.println("Methoddan once calisti.");
    }

    @Test
    public void test1(){
        System.out.println("Test 1 calisti...");
    }

    @Test
    public void test2(){
        System.out.println("Test 2 calisti...");
    }

    @After
    public void methoddanSonra(){
        System.out.println("Methoddan sonra calisti...");
    }

    @AfterClass
    public static void tearDown(){
        System.out.println("Tear down calisti...");
    }




}
