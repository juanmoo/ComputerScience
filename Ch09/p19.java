import java.util.Scanner;
import java.util.Arrays;

public class p19 {
	public static void main(String[] args) {
		System.out.print("Enter Word: ");
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();

		System.out.println(Arrays.toString(allSubstrings(str)));
	}

	public static String[] allSubstrings(String s) {
		int length = s.length();
		int num = 0;
		int n = length;
		String[] subs = new String[(n*n+n)/2];
		for (int size = length; size>=1; size--) {
			int start = 0;
			for (int i = length-size+1; i>=1; i--) {
				subs[num] = s.substring(start, start+size);
				num++;
				start++;
			}
		}

//		System.out.println((n*n+n)/2);
//		System.out.println(num);
		return subs;
	}
}
