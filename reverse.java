// program to reverse a number .

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("number="+n);
        int c=0;
        while(n>0)
        {
            
            int a=n%10;
            c= c*10+a;
            n=n/10;
        }
        System.out.println("reverse number="+c);
    }
    
}
