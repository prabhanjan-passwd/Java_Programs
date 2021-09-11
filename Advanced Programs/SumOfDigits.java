/* 

Program to find sum of digits
Input : Any positive integer
Output : print sum of all its digits

Input : 1234
Output : 10

Input : 129487
Output : 31

*/
import java.util.*;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum=0,rem;
        while(num!=0)
        {
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
