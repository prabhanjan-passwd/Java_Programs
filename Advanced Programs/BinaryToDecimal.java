/* 

Write a program to convert Binary Number to Decimal Number
Sample 1:
    Input : 1000
    Output : 8
Sample 2:
    Input : 1010
    Output : 10
*/
import java.util.*;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Binary Number : ");
        int n = sc.nextInt();
        int temp2 = n;
        int k=0;
        double mul,sum=0;
        while(temp2!=0)
        {
            int rem = temp2 % 10;
            mul = rem * Math.pow(2, k++);
            sum = sum + mul;
            temp2 /= 10;
        }
        System.out.println((int)sum);
    }
}
