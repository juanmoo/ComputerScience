//Import Statements
import java.util.Scanner;
import java.util.Arrays;

public class p9 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter m: ");
		int m = kb.nextInt();
		System.out.print("\nEnter n: ");
		int n = kb.nextInt();

		System.out.println(Arrays.toString(makePythagoreanTriple(m,n)));
	}

	public static int[] makePythagoreanTriple (int m, int n) {
		if (n>m) {
			int temp1 = n;
			n = m;
			m = temp1;
		}

		int a = m*m - n*n;
		int b = 2*m*n;
		int c = m*m + n*n;

		return new int[]{a,b,c};
		
	}	
}
