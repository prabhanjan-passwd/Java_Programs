/* 

write a program to find LCM of two numbers

Formula : 
LCM = (number1 * number2) / gcd(number1,number2)

Input : 15 20 
Output : 60

Input : 15 25
Output : 75

Input : 30 60
Output : 60
*/
import java.util.*;
public class LcmOfTwoNumbers {
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
        return (a*b) / gcd(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(lcm(n1, n2));
    }
}
