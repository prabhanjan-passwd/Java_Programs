/* 

Write a program to check if a given number is a strong number or not. A strong number is a 
number in which the sum of the factorial of the digits is equal to the number itself.

123 = 1! + 2! + 3! = 1 + 2 + 6 = 9 (Not Strong Number)
145 = 1! + 4! + 5! = 1 + 24 + 120 = 145 (Strong Number)
*/
import java.util.*;
public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rem,sum=0;
        int temp1 = num;
        while(temp1!=0)
        {
            int fact = 1;
            rem = temp1 % 10;
            for(int i=1;i<=rem;i++)
            {
                fact = fact * i;
            }
            sum += fact;
            temp1 /= 10;
        }
        if(num==sum)
        {
            System.out.println("Strong Number...");
        }
        else
        {
            System.out.println("Not a Strong Number...");
        }
    }
}
