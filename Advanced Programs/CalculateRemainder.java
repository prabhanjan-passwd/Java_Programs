/* 

Given Two Positive integers num1 and num2, the task is to find the remainder 
without using modulus operator when num1 is divided by num2.

Example 1 :
Input : 5 3
Output : 2
Explanation : 5%3=2

Example 2 :
Input : 5 10
Output : 5
Explanation : small number 5 (num1) cannot be divided by bigger number 10 (num2).
smallerNumber % biggerNumber = smallerNumber

*/
import java.util.*;
public class CalculateRemainder {
    static int calculateRemainder(int num1,int num2)
    {
        // smallerNumber % biggerNumber = smallerNumber
        if(num1 < num2)
        {
            return num1;
        }
        int quotient = num1 / num2;
        return (num1 - (quotient * num2));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(calculateRemainder(num1, num2));
    }
}

/* 
Logic Part : 
If there are two numbers num1 and num2
    1) First Calculate Quotient i.e quotient = num1 / num2
    2) Now multiply quotient and num2.
    3) Now substract num1 and obtained value after multiplication at step 2.
    4) Now we will get the remainder

    Important : 
    if we divide the smaller number by bigger number then remainder will always be smaller number.
     -> smallerNumber % biggerNumber = smallerNumber

Example 1 :
num1 = 50 num2 = 4
    1) quotient = num1 / num2
             12 = 50 / 4 
        quotient = 12
    2) multiply quotient and num2
             12 * 4 = 48
    3) substract num1 and obtained value at step 2
             50 - 48 = 2
    4) remainder = 2

Example 2 :
num2 = 10  num2 = 20
remainder = 10
smallerNumber % biggerNumber = smallerNumber
*/