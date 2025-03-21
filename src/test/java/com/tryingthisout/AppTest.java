package com.tryingthisout;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void evenOrOddTestEven(){
        assertEquals("Number 66 is even", EvenOrOdd.evenOrOdd(66));   
    }

    @Test
    public void evenOrOddTestOdd(){
        assertEquals("Number 65 is odd", EvenOrOdd.evenOrOdd(65));
    }
    
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
