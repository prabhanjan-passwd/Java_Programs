/* 

Find out second largest numbers of 3 numbers
Input : three integers separated by space denoting the numbers to be compared to find second 
        largest number
Output : second largest number out of the three given numbers

Input : -4 0 4
Output : 0

Input : 101 101 98
Output : 101
*/
import java.util.*;
public class SecondLargestFromThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        //a is largest number
        if(num1 >= num2 && num1 >= num3)
        {
            if(num2 >= num3)
                System.out.println(num2);
            else
                System.out.println(num3);
        }
        // b is largest number
        else if(num2 >= num1 && num2 >= num3)
        {
            if(num1>=num3)
                System.out.println(num1);
            else
                System.out.println(num3);
        }
        //c is the largest number
        else if(num1>=num2) 
        {
            System.out.println(num1);
        }
        else
        {
            System.out.println(num2);
        }
    }    
}
