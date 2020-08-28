package com.techproed;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Day08_BeforeAfterClass {

    @BeforeClass     //Bu annotationa sahip method her class calismadan once calisir.
    public static void setUp(){
        System.out.println("setUp çalıştı.");
    }

    @Test
    public void test1(){
        System.out.println("Test 1 çalıştı.");
    }

    @Test
    public void test2(){
        System.out.println("Test 2 çalıştı.");
    }


    @AfterClass      //Bu annotationa sahip method her classtaki testler calistirildiktan sonra calisir.
    public static void TearDown(){
        System.out.println("tearDown çalıştı.");
    }
}
