package Junit.testProject;

import static org.junit.Assert.assertEquals;

import org.junit.Assert.*;
import org.junit.Test;


public class MaximumTest {
	//test methods
	
	@Test
	public void shouldReturnTrue_ForMaxInteger ()
	{	
		Integer [] arr1= {17,18,11};	
		int max1=Maximum.maximum(arr1);
		assertEquals( 18 , max1 );
		
		Integer [] arr2= {17,18,11,22,3};	
		int max2=Maximum.maximum(arr2);
		assertEquals( 22 , max2 );
	}
	 
	@Test
	public void shouldReturnTrue_ForMaxDouble ()
	{	
		Double [] arr1= {2.5 , 5.1 , 3.4};
	    double max1=Maximum.maximum(arr1);
	    assertEquals( 5.1 , max1 , 0);
	    
	    Double [] arr2= {2.5 , 5.1 , 3.4 , 22.4 , 13.4 , 6.4};
	    double max2=Maximum.maximum(arr2);
	    assertEquals( 22.4 , max2 , 0);
	}
	@Test
	public void shouldReturnTrue_WhenMaxStringAt1stPosition ()
	{	
	    String [] arr1={"Good","Better","Bad"};
	    String max1=Maximum.maximum(arr1);
	    assertEquals( "Good" , max1 );
	        
	    String [] arr2={"Good","Better","Best","Bad","Worst"};
	    String max2=Maximum.maximum(arr2);
	    assertEquals( "Worst" , max2 );
	        
	 }
	    
}