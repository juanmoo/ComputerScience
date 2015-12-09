import java.util.Scanner;
import java.util.Arrays;

public class p19b extends p19 {
	public static void main(String args[]) {
		String[] words = new String[]{"dog","cat","poop","flowers","are","red"};
		String[][] w = splitWords(words);
		for (String[] a:w) {
			System.out.println(Arrays.toString(a));
		}
	}

	public static String[][] splitWords(String[] words) {
		String[][] w = new String[words.length][];
		int n = 0;
		for (String s: words) {
			w[n] = allSubstrings(s);
			n++;
		}
		return w;
	}
}
