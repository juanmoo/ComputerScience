public class p23 {
    public static void main(String args[]) {
        double[] hello = new double[]{1,2,3,4,5,6,7,8,9};
        double num = 4;
        
        System.out.println(isMedian(hello, num));
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