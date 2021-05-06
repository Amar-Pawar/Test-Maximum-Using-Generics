package Junit.testProject;


public class Maximum <E extends Comparable<E>>
{	
	public static <E extends Comparable<E>> E maximum(E[] a ) {
		E max = a[0];
		for(int i=1 ; i< a.length ; i++) {
			if(a[i].compareTo(max) > 0 )
				max=a[i];	
		}
		return max;
	}
	
}