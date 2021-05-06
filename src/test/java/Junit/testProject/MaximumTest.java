package Junit.testProject;

import static org.junit.Assert.assertEquals;

import org.junit.Assert.*;
import org.junit.Test;


public class MaximumTest {
	
	@Test
    public void shouldReturnTrue_WhenMaxIntegerAt1stPosition ()
    {
    	int max=Maximum.maxInteger(5,1,2);
        assertEquals( 5 , max );
    }
    
    @Test
    public void shouldReturnTrue_WhenMaxIntegerAt2ndPosition()
    {
    	int max=Maximum.maxInteger(1,5,2);
        assertEquals( 5 , max );
    }
    
    @Test
    public void shouldReturnTrue_WhenMaxIntegerAt3rdPosition()
    {
    	int max=Maximum.maxInteger(1,2,5);
        assertEquals( 5 , max );
    }
}


