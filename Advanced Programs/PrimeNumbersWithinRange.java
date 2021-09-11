/* 

Write a program to find all possible prime numbers within range
Input : Two positive integers separated by space denoting start and end of range
Output : List of all possible prime numbers within the range separated by space

Input : 1 10
Output : 2 3 5 7

Input : 1 100
Output : 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
*/
import java.util.*;
public class PrimeNumbersWithinRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int temp=0;
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
                System.out.print(i+" ");
            }
            else
            {
                temp=0;
            }
        }
    }
}
