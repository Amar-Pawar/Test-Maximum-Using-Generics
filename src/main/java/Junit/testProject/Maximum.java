package Junit.testProject;

public class Maximum{

		public static double maxDouble(Double d, Double e, Double f) {
			double max=d;
			if(e.compareTo(max) > 0 )
				max=e;
			if(f.compareTo(max) > 0 )
				max=f;
				
		return max;
		}
}


