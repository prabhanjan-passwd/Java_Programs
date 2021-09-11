/* 

Write a program to find n-th fibonacci number
Input : 9
Output : 34

Input : 0
Output : 0

Input : 12
Output : 144
*/
import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a=0,b=1,c=0;
        for(int i=2;i<=num;i++)
        {
            c = a+b;
            a=b;
            b=c;
        }
        System.out.print(c+" ");
    }
}
