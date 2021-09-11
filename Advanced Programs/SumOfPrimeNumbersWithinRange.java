/* 

Write a program to print sum of all possible prime numbers within the range
Input : Two positive integers separated by space denoting start and end of range
Output : sum of all possible prime numbers within the range

Input : 1 10
Output : 17

Input : 1 100
Output : 1060
*/
import java.util.*;
public class SumOfPrimeNumbersWithinRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int temp=0,sum=0;
        for(int i=num1;i<=num2;i++)
        {
            if(i==1)
            {
                continue;
            }
            for(int j=2;j<=i-1;j++)
            {
                if(i%j==0)
                {
                    temp++;
                }
            }
            if(temp==0)
            {
                sum = sum + i;
            }
            else
            {
                temp=0;
            }
        }
        System.out.println(sum);
    }
}
