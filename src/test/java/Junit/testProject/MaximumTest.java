package Junit.testProject;

import static org.junit.Assert.assertEquals;

import org.junit.Assert.*;
import org.junit.Test;


public class MaximumTest {
	
	
	@Test
	public void shouldReturnTrue_WhenMaxIntegerAt1stPosition ()
	{
		 int max=Maximum.printMax(5,1,2);
		 assertEquals( 5 , max );
	}
	    
	@Test
	public void shouldReturnTrue_WhenMaxIntegerAt2ndPosition()
	{
		 int max=Maximum.printMax(1,5,2);
	     assertEquals( 5 , max );
	}
	    
	@Test
	public void shouldReturnTrue_WhenMaxIntegerAt3rdPosition()
	{
	    int max=Maximum.printMax(1,2,5);
	    assertEquals( 5 , max );
	}
	

	@Test
	public void shouldReturnTrue_WhenMaxDoubleAt1stPosition ()
	{
	    double max=Maximum.printMax(5.1,1.3,2.8);
	    assertEquals( 5.1 , max , 0);
	}

	@Test
	public void shouldReturnTrue_WhenMaxDoubleAt2ndPosition()
	{
		double max=Maximum.printMax(1.3,5.1,2.8);
		assertEquals( 5.1 , max , 0 );
	}
    
	@Test
	public void shouldReturnTrue_WhenMaxDoubleAt3rdPosition()
	{
		double max=Maximum.printMax(1.3,2.8,5.1);
		assertEquals( 5.1 , max , 0 );
	}
	
	@Test
    public void shouldReturnTrue_WhenMaxStringAt1stPosition ()
    {
    	String max=Maximum.printMax("good", "better", "bad");
        assertEquals( "good" , max );
    }
    
    @Test
    public void shouldReturnTrue_WhenMaxStringAt2ndPosition()
    {
    	String max=Maximum.printMax("bad", "good", "better");
        assertEquals( "good" , max );
    }
    
	@Test
    public void shouldReturnTrue_WhenMaxStringAt3rdPosition()
    {
    	String max=Maximum.printMax("bad", "better", "good");
        assertEquals( "good" , max );
    }
}


