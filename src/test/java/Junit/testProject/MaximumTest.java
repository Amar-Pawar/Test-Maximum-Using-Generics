package Junit.testProject;

import static org.junit.Assert.assertEquals;

import org.junit.Assert.*;
import org.junit.Test;


public class MaximumTest {
	
	@Test
    public void shouldReturnTrue_WhenMaxStringAt1stPosition ()
    {
    	String max=Maximum.maxString("good", "better", "bad");
        assertEquals( "good" , max );
    }
    
    @Test
    public void shouldReturnTrue_WhenMaxStringAt2ndPosition()
    {
    	String max=Maximum.maxString("bad", "good", "better");
        assertEquals( "good" , max );
    }
    
	@Test
    public void shouldReturnTrue_WhenMaxStringAt3rdPosition()
    {
    	String max=Maximum.maxString("bad", "better", "good");
        assertEquals( "good" , max );
    }
}


