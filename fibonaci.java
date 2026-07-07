//program to print fibonaci series.
// fibonaci series : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34

public class fibonaci {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int n=50;
        System.out.print(+a+ ",");
        System.out.print(+b+ ",");
        while(n>0)
        {
            int c=a+b;
            System.out.print(+c+ ",");
            a=b;
            b=c;
            n--;
        }
    }
}
