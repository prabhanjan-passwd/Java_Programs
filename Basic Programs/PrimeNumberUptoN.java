// Program to print the prime numbers from 1 to N
import java.util.*;
public class PrimeNumberUptoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number :");
        int n = sc.nextInt();
        int temp=0;
        for(int i=2;i<=n;i++)
        {
            for(int j=2;j<=i-1;j++)
            {
                if(i%j==0)
                {
                    temp++;
                }
            }
            if(temp==0)
            {
                System.out.println(i);
            }
            else
            {
                temp=0;
            }
        }
    }
}
