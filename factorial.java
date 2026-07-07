// program to find factorial of a number.
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        int f=1;
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        System.out.println("number="+a);
        for(int c=1; c<=a; c++){
            f=f*c;
        }
        System.out.println("Factorial ="+f);
  }
    
}
