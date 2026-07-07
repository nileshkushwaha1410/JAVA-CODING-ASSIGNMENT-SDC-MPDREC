// program to find power of a number.
import java.util.Scanner;
public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("number="+a);
        int b=sc.nextInt();
        System.out.println("power="+b);
        int c= Math.powExact(a, b);
        System.out.println("result="+c);
    }
}
