/* 

Write a program to find GCD(greatest common divisor) of two numbers.
Input : Two positive integers separated by space
Output : positive integer which is GCD of two numbers

Input : 20 28
Output : 4

Input : 98 56
Output : 14

*/
import java.util.*;
public class GcdUsingRecursion {
    static int gcdOfTwoNumbers(int a,int b)
    {
        if(a==0)
        {
            return b;
        }
        return gcdOfTwoNumbers(b%a, a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(gcdOfTwoNumbers(num1, num2));
    }
}
 
/* 
Explanation :
    static int gcdOfTwoNumbers(int a,int b)
    {
        if(a==0)
        {
            return b;
        }
        return gcdOfTwoNumbers(b%a, a);
    }

    Suppose :
        gcd(20,28)

        a=20 b=28
        gcdOfTwoNumbers(b%a, a) -> gcdOfTwoNumbers(28 % 20, 20) -> gcdOfTwoNumbers(8, 20)

        a=8 b=20
        gcdOfTwoNumbers(b%a, a) -> gcdOfTwoNumbers(20 % 8, 8) -> gcdOfTwoNumbers(4, 8)

        a=4 b=8
        gcdOfTwoNumbers(b%a, a) -> gcdOfTwoNumbers(8 % 4, 4) -> gcdOfTwoNumbers(0, 4)
        
        a=0 b=4
            Now value of a is 0 then return value of b i.e 4.
*/