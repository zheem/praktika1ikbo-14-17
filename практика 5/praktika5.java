package recursion;
import java.util.Scanner;
public class Recursion {
    static int sum = 0;
    public static int rec (int n) {
        if (n==0) return sum;
        sum = sum + n%10;
        return rec(n/10);
        
    }
    public static void main(String[] args) {
        int n = 0;
        Scanner in = new Scanner(System.in);
        System.out.println ("Enter a natural number:\n");
        n = in.nextInt();
        System.out.println ("Total sum of digits: " + rec(n));
    }
    
}