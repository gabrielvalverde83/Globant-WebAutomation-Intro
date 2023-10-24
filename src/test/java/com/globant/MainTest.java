package com.globant;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import org.testng.log4testng.Logger;

public class MainTest {
    public Logger log = Logger.getLogger(MainTest.class);

    @Test
    @Parameters({"string1", "string2"})
    public void testParameters(String a, String b){
        log.info(a);
        log.info(b);
    }

    @Test
    @Parameters({"string1", "string2"})
    public void testParameters2(String a, String b) {
        Assert.assertEquals(a, "Hola");
        Assert.assertEquals(b, "Globers");
    }

    @Test
    @Parameters({"string1", "string2"})
    public void testParameters3(String a, String b) {
        Assert.assertEquals(a, "Hello");
        Assert.assertEquals(b, "Globant");
    }

    @DataProvider(name = "translateHello" )
    public static Object [][] inputData(){
        return new Object[][] {{"Hello"}, {"Hola"}, {"Ciao"}};
    }

    @Test(dataProvider = "translateHello")
    public void testTranslate(String data){
        log.info(data);
    }





}
