package org.fede.test;


import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{

    @Test()
    public void testSomma(){
        int actual = App.somma(3, 4);
        int expected = 7;
        Assert.assertEquals(expected, actual);
    }

    @Test()
    public void testSommaMenoUno(){
        int actual = App.somma(2, 1000);
        int expected = -1;
        Assert.assertEquals(expected, actual);
    }

    @Test()
    public void testUpperCase(){
        String actual = App.upperCase("luca");
        String expected = "LUCA";
        Assert.assertEquals(expected, actual);
    }

    @Test()
    public void testDiv(){
        int actual = App.div(10, 2);
        int expected = 5;
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDiv0(){
        int actual = App.div(10, 0);
    }

    @Test()
    public void testDiv0_2(){
        try {
            int actual = App.div(10, 0);
        }
        catch(IllegalArgumentException ex)
        {
            //OK
            return;
        }
        Assert.fail();
    }




}
