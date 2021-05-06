package Junit.testProject;

import static org.junit.Assert.assertEquals;

import org.junit.Assert.*;
import org.junit.Test;


public class MaximumTest {
	
	
	@Test
	public void shouldReturnTrue_ForMaxInteger ()
	{
		 int max1=Maximum.maximum(5,1,2);
		 assertEquals( 5 , max1 );
		 int max2=Maximum.maximum(1,5,2);
	     assertEquals( 5 , max2 );
	     int max3=Maximum.maximum(1,2,5);
		 assertEquals( 5 , max3 );
	}
	 
	   
		@Test
		public void shouldReturnTrue_ForMaxDouble ()
		{
		    double max1=Maximum.maximum(5.1,1.3,2.8);
		    assertEquals( 5.1 , max1 , 0);
		    double max2=Maximum.maximum(1.3,5.1,2.8);
			assertEquals( 5.1 , max2 , 0 );
			double max3=Maximum.maximum(1.3,2.8,5.1);
			 assertEquals( 5.1 , max3 , 0 );
		}
	    

	    @Test
	    public void shouldReturnTrue_WhenMaxStringAt1stPosition ()
	    {
	    	String max1=Maximum.maximum("Good","Better","Bad");
	        assertEquals( "Good" , max1 );
	        String max2=Maximum.maximum("Bad","Good","Better");
	        assertEquals( "Good" , max2 );
	        String max3=Maximum.maximum("Bad","Better","Good");
	        assertEquals( "Good" , max3 );
	    }
	    
	}