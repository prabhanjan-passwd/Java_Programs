/* 

Find out smallest of 4 numbers(numbers are not equal)
Input : Four integers separated by space denoting the numbers to be compared to find smallest number
Output : smallest number out of the four given numbers
*/
import java.util.*;
public class SmallestNumberFromFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        if(num1 < num2 && num1 < num3 && num1 < num4)
        {
            System.out.println(num1);
        }
        else if(num2 < num1 && num2 < num3 && num2 < num4)
        {
            System.out.println(num2);
        }
        else if(num3 < num1 && num3 < num2 && num3 < num4)
        {
            System.out.println(num3);
        }
        else
        {
            System.out.println(num4);
        }
    }
}
