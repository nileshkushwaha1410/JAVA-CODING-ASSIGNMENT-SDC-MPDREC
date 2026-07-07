// program to check whether a number is +ve or -ve .
import java.util.Scanner;
public class number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("NUMBER="+n);
        if (n>0) {
            System.out.println("Number is positive");
                } else {
                    System.out.println("Number is negative");
        }
        
    }
    
}
