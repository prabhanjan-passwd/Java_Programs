/* 

Find out greatest of 3 numbers(3 numbers are not equal)
Input : Three integers separated by space denoting the numbers to be compared to find greatest number
Output : Greatest number out of the three given numbers

Input : 12 8 47
Output : 47

Input : -1 0 -8
Output : 0
*/
import java.util.*;
public class GreatestNumberFromThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if(num1 > num2 && num1 > num3)
        {
            System.out.println(num1);
        }
        else if(num2 > num1 && num2 > num3)
        {
            System.out.println(num2);
        }
        else
        {
            System.out.println(num3);
        }
    }
}
