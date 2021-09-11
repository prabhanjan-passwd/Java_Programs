/* 

Write a program find LCM of two numbers.

*/
import java.util.*;
public class LcmUsingRecursion {
    
    static int gcd(int a,int b)
    {
        if(a==0)
        {
            return b;
        }
        return gcd(b%a, a);
    }
    static int lcm(int a,int b)
    {
        return a*b/gcd(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(lcm(num1, num2));
    }
}
