/* 

Program to check whether a number is plus perfect number or not.

Input : Input to get an integer N

Output : 
Print "True" if number is plus perfect number
Print "False" if number is not plus perfect number

Input : 153
Output : True

Input : 369
Output : False

** ArmStrong Number and Plus Perfect Number both are same**

*/
import java.util.*;
public class PlusPerfectNumber {
    static void checkPlusPerfectNumber(int n)
    {
        int temp1 = n;
        int length = 0;
        while(temp1!=0)
        {
            length++;
            temp1 /= 10;
        }
        int temp2 = n;
        int rem,sum=0;
        while(temp2!=0)
        {
            int mul=1;
            rem = temp2 % 10;
            for(int i=1;i<=length;i++)
            {
                mul *= rem;
            }
            sum += mul;
            temp2 /= 10;
        }    
        if(n==sum)
            System.out.println("True");
        else
            System.out.println("False");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        checkPlusPerfectNumber(num);
    }
}
