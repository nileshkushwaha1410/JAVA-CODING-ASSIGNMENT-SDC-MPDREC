// program to swap 2 numbers using third variable.
import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("ENTER 2 NUMBERS");
        System.out.println("Before swapping " );
        int a = sc.nextInt();
        System.out.println("a="+a);
        int b = sc.nextInt();
        System.out.println("b="+b);
        int c = a;
        a=b;
        b=c;
        System.out.println("After swapping");
        System.out.println("a="+a);
        System.out.println("b="+b);

    }
}

