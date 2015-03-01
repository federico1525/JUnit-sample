package org.fede.test;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by fede on 2/28/15.
 */
public class RobboTest {

    @Test
    public void testSayHello(){
        String name = "stocazzo";
        Robbo robboTest = new Robbo(name);


        String actual = robboTest.sayHello();
        String expected = "stocazzo";
        Assert.assertEquals(expected, actual);
    }
}
