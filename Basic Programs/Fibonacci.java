import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number :");
        int n = sc.nextInt();
        int a=0,b=1,c;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i=1;i<n-1;i++)
        {
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}
