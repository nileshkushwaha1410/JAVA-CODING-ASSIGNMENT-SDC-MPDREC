// program to solve quadratic equation.
import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("coefficient of x^2=a=");
        double a=sc.nextDouble();
        System.out.println("coefficient of x=b=");
        double b=sc.nextDouble();
        System.out.println("constant=c=");
        double c=sc.nextDouble();
        
        double d=(b*b)-(4*a*c);
        System.out.println("Discriminant="+d);
        
        System.out.println(+a+"x^2+"+b+"x+"+c);
       
        if(a==0){
        System.out.println("ROOT DOES NOT EXIST");
        }
        double r1;
        double r2;
        if (d>0) {
            System.out.println("real roots");
            r1= (-b+Math.sqrt(d))/(2*a);
            r2= (-b-Math.sqrt(d))/(2*a);
            System.out.println("roots are"+r1+"and"+r2);
        }
         if (d<0){
            System.out.println("imaginary roots");
            r1= (-b+Math.sqrt(d))/(2*a);
            r2= (-b-Math.sqrt(d))/(2*a);
            System.out.println("roots are "+r1+" and "+r2);
         }
         if (d==0){
            System.out.println("equal roots");
            r1= -b/(2*a);
            r2= -b/(2*a);
            System.out.println("roots are equal "+r1+" and "+r2);
         }
        
    }
    
}
