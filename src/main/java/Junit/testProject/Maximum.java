package Junit.testProject;


public class Maximum <E extends Comparable<E>>
{	
	public static <E extends Comparable<E>> E maximum(E[] a ) {
		E max = a[0];
		for(int i=1 ; i< a.length ; i++) {
			if(a[i].compareTo(max) > 0 )
				max=a[i];	
		}
		printMax(a, max);
		return max;
	}
	
	public static <E> void printMax(E[] a , E max) {
		for(int i=1 ; i< a.length ; i+=a.length) {
			System.out.println("Max is : "+max );
		}	
		
	}
	
}