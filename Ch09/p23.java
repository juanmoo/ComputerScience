import java.util.Scanner;
import java.util.Arrays;

public class p23 {
    public static void main(String args[]) {
//        double[] hello = new double[]{1,2,3,4,5,6,7,8,9};
  //      double num = 4;
	Scanner kb = new Scanner(System.in);
	System.out.print("Enter the number of elements in the list: ");
	int length = kb.nextInt();

	double[] list = new double[length];

	for (int i = 0; i <= length-1; i++) {
		System.out.print("Enter element number "+(i+1)+" :");
		list[i] = kb.nextInt();
		System.out.println();
	}
	System.out.print("Enter number: ");
	int num = kb.nextInt();

	String array = Arrays.toString(list);
	System.out.println("The list is :"+array+".");        

        System.out.println(isMedian(list, num));
    }
    
    public static boolean isMedian(double[] list, double median) {
        int before = 0;
        int after = 0;
        
        for (double num : list) {
            if (num < median) before++;
            if (num > median) after ++;
        }
        
        return before == after;
    }
}
