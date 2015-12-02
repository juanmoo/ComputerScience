import java.util.Scanner;
import java.util.Arrays;

public class p11 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println(Arrays.toString(fibonacci(n)));
	}

	public static int fibonacciNum(int n){
		if (n == 0) return 0;
        	int i =1;
        	int a =0;
        	int b =1;
        	int c;
        	while(n>i){
            		c=b;
            		b=b+a;
            		a=c;
            		i=i+1;

        	}
        	return b;

    	}

	public static int[] fibonacci(int n) {
		int[] a = new int[n+1];
		for (int i = 0; i<=n; i++ ){
			//Array.setInt(a,i,fibonacciNum(i));
			a[i] = fibonacciNum(i);
		}
		return a;
		
	} 
}
