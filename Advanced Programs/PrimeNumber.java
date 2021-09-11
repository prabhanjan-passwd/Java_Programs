/* 

Write a program to find if number is prime number or not.if number is prime number then print
number is prime number and then print its square root up to two decimal points precision.

Input : positive integer
output : square root of number (if number is prime number).
number is not prime number(if number is not prime number)

Input : 5
Output : 5 is a prime number 2.24

Input : 22
Output : 22 is not a prime number
*/
import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp=0;
        for(int i=2;i<=n-1;i++)
        {
            if(n%i==0)
            {
                temp++;
            }
        }
        if(temp==0)
        {
            Double result = Math.sqrt(n);
            double sqrt = (double)Math.round(result*100)/100;
            System.out.println(n+" is a prime number "+sqrt);
        }
        else
        {
            System.out.println(n+" is not a prime number");
        }
    }
}
