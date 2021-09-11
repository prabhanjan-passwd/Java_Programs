/* 
    Write a program to check whether the given number is palindrome or not. Any Number is said
    to be a palindrome if the original number and the reverse of the original number are the same.

    For example : 
    1) 1221 is a palindrome number.

        Original Number : 1221
        reverse of the number = 1221

    2) 1234 is not a palindrome number

        original number : 1234
        reverse of the number : 4321
*/
import java.util.*;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp1 = num;
        int rem,rev=0;
        while(temp1 != 0)
        {
            rem = temp1 % 10;
            rev = rev * 10 + rem;
            temp1 /= 10;
        }
        if(rev==num)
        {
            System.out.println("Palindrome Number...");
        }
        else
        {
            System.out.println("Not a Palindrome Number...");
        }
    }
}
