public class p14 {
	public static void main (String [] args) {
		double[][] hello = {{2,2,2},{2,2,2},{3,2,5}};

		System.out.println(maxOrZero(hello));
	}

	public static double maxOrZero (double[][] m) {
		double max = 0;
		int len = m.length;		

		for (int i = 0;i<=len-1;i++) {
			for (double t:m[i]) {
				if (t>max) {
               max = t;
            }
           
			}
         
		}
      return max; 
	}
}
