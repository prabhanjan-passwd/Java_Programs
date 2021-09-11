/* 

Write a program to find the number of integers with exactly 9 divisors.

Input : 100   (here 100 means integers from 1 to 100 having 9 divisors)
Output : 
2             (total integers having exactly 9 divisors)
36 100

Divisors of 36 : 1,2,3,4,6,9,12,18,36
Divisors of 100 : 1,2,4,5,10,20,25,50,100

*/
import java.util.*;
public class IntegersWith9Divisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0;
        for(int i=1;i<=n;i++)
        {
            int count=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count==9)
            {
                total++;
                System.out.print(i+" ");
            }
        }
        System.out.println("\n"+total);
    }
}
