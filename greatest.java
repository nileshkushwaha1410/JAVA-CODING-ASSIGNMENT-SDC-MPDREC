// program to find greatest of three numbers.
import java.util.Scanner;
public class greatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The three numbers are :");
        int a=sc.nextInt();
        System.out.println("a="+a);
        int b=sc.nextInt();
        System.out.println("b="+b);
        int c=sc.nextInt();
        System.out.println("c="+c);
        if (a>b && a>c) {
            System.out.println("greatest number is a = " + a);
            
        } if (b>a && b>c) {
             System.out.println("greatest number is b = " + b);
       }    
        System.out.println("greatest number is c = " + c);
       } 
       }
        
       
            
  
