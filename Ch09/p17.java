public class p17 {
	public static void main(String args[]) {

		double[] hello =  new double[]{1,2,3,4,5,6,7,8,9,10};


		System.out.println(averageA(hello));
	}

	public static double averageA(double[] d) {
		int count = 0;
		double total = 0;

		if (d.length == 0) return 0;
		
		for (double a : d) {
			count += 1;
			total += a;
		}

		return total/count; 
	}
}
