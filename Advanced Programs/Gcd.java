/* 

write a program to find Greatest Common divisor(GCD) or HCF of two numbers.
Input : two positive integers separated by space
Output : positive integer which is GCD of two numbers

Input : 20 28
Output : 4

Input : 98 56
Output : 14
*/
import java.util.*;
public class Gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int r1 = (num1>num2)? num1:num2;
        int r2 = (num2>num1)? num1:num2;
        while(r2!=0)
        {
            int remainder = r1 % r2;
            r1 = r2;
            r2 = remainder; 
        }
        System.out.println("GCD : "+r1);
    }
}
