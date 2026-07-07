// program to find perimeter of rectangle.
import java.util.Scanner;
public class RectanglePerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("ENTER LENGTH AND BREADTH");
        int l = sc.nextInt();
        System.out.println("length="+l);
        int b = sc.nextInt();
        System.out.println("breadth="+b);
        int p = 2*(l+b);
        System.out.println("perimeter of rectange ="+p);
    }
}
