package Junit.testProject;


public class Maximum <E extends Comparable<E>>
{	
	E x , y , z;

	public Maximum(E x, E y, E z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public  E maximum(){
		return Maximum.maximum(x, y, z); 
	}

	public static <E extends Comparable<E>> E maximum(E x , E y , E z) {
		E max=x;
		if(y.compareTo(max) > 0 )
			max=y;
		if(z.compareTo(max) > 0 )
			max=z;
		
			
	return max;
	}

	
}