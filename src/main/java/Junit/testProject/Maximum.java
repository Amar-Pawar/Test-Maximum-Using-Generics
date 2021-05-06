package Junit.testProject;

public class Maximum{

	public static <E extends Comparable<E>> E printMax(E x , E y , E z) {
		E max=x;
		if(y.compareTo(max) > 0 )
			max=y;
		if(z.compareTo(max) > 0 )
			max=z;
			
	return max;
	}
}

