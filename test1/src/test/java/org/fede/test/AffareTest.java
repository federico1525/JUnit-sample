package org.fede.test;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by fede on 2/28/15.
 */

public class AffareTest {


    @Test
    public void testFaiCose()
    {
        String expected = "LUCA";

        //Robbo robbo = new Robbo("Luca");

        Robbo robbo = Mockito.mock(Robbo.class);
        when(robbo.sayHello()).thenReturn("Luca");

        String actual = Affare.faiCose(robbo);
        Assert.assertEquals(expected, actual);

        verify(robbo).sayHello();
        verify(robbo, never()).sayBanana();


    }
}
