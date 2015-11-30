import java.util.Scanner;
import java.util.Arrays;

public class p7 {
    public static void main(String args[]) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a: \n");
        double a = kb.nextDouble();
        System.out.print("Enter b: \n");
        double b = kb.nextDouble();
        System.out.print("Enter c: \n");
        double c = kb.nextDouble();

        

        System.out.println(Arrays.toString(findRoots(a, b, c)));
    }

    public static double[] findRoots(double a, double b, double c) {
            double d = b*b-4*a*c;  
            if (a==0){
                throw new IllegalArgumentException("a = 0");
            }
              
            else if (d<0) {
                return null;
            }
            else if (d == 0) {
                double[] roots = new double[]{-b/(2*a)};
                return roots;
            }
            else if  (d>0) {
                 double[] roots = {( -b+ Math.sqrt(d) )/(2*a), ( -b- Math.sqrt(d) )/(2*a) };
                 return roots;
            }
            //return roots;
            else return null;
	}
		

}
