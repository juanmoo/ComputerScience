import java.util.Scanner;
import java.util.Arrays;

public class p24 {
    public static void main(String args[]) {
        
       // int[] list = new int[]{1,2,3,4,5};
        Scanner kb = new Scanner(System.in);

        
        System.out.print("Enter the number of elements in the list: ");
        int length = kb.nextInt();
        
        int[] list = new int[length];
        
        for (int i = 0; i <= length-1; i++) {
            System.out.print("Enter element number "+(i+1)+" :");
            list[i] = kb.nextInt();
            //System.out.println();
        }

        
        
        System.out.println("The list is : "+Arrays.toString(list));
        
        while (true) {
            System.out.print("Rotate Left(l), Right(r), or break to stop :  ");
            
            String ans = kb.nextLine();
            
            if (ans.equalsIgnoreCase("l")) rotateLeft(list);
            else if (ans.equalsIgnoreCase("r")) rotateRight(list);
            else if (ans.equalsIgnoreCase("break")) break;
            else if (ans.equalsIgnoreCase("clear")) {
                for(int i = 0; i<= 200; i++) {
                    System.out.println();
                }
            }
            
            else System.out.println("Invalid Input");
            
            System.out.println("The list is : "+Arrays.toString(list));        }
        
    }
    
    public static void rotateRight(int[] list) {
        int first = list[0];
        int last = list[list.length-1];
        for(int i = list.length-1; i>0; i--) {
            list[i] = list[i-1];
        }
        
        //list[list.length-1] = first;
        
        list[0] = last;
        
    }
    
    public static void rotateLeft(int[] list) {
        int first = list[0];
        for (int i = 0; i<=list.length-2;i++) {
            list[i] = list[i+1];
        }
        
        list[list.length-1] = first;
    }
}