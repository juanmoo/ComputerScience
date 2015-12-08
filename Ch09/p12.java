import java.util.Scanner;
public class p12 {
    public static void main(String[] args) {
    
        Scanner kb = new Scanner(System.in);
        
        String w = kb.nextLine();
        System.out.println(pointValue(w));
        
    }
    
    public static int pointValue (String word) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int[] points = new int[]{1,3,3,2,1,4,2,4,1,8,5,1,3,1,1,3,10,1,1,1,1,4,4,8,4,10};
        
        int pts = 0;
        int l = word.length();
        for (int i = 0; i<l; i++) {
            pts += points[alphabet.indexOf(word.charAt(i))];
            
        }
                          return pts;
        
    }

}