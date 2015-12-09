import java.util.Arrays;
import java.util.Scanner;

public class p20 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int n  = kb.nextInt();
		int[][] a = pascalTriangle(n);

		for (int[] rows:a) {
			System.out.println(Arrays.toString(rows));
		}
	}

	public static int[][] pascalTriangle(int n){
		int[][] pas = new int[n][];
		for (int rows = 0; rows<=n-1; rows++) {
			pas[rows] = new int[rows+1];
			int tot = rows+1;
			for (int col = 0; col<= tot-1; col++) {
				if (col == 0||col == tot-1) {
					pas[rows][col] = 1;
				}
				else  {
					pas[rows][col] = pas[rows-1][col-1] + pas[rows-1][col];
				}
			}
		}
		return pas;
	}
}
