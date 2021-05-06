package Junit.testProject;

public class Maximum{

		public static String maxString(String str1, String str2, String str3) {
			String max=str1;
			if(str2.compareTo(max) > 0 )
				max=str2;
			if(str3.compareTo(max) > 0 )
				max=str3;
				
		return max;
		}
}


