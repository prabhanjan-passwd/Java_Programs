/* 
Write a program to check whether a year is a leap
year or not?

Input : 2016
Output : Leap Year

Input : 2019
Output : Not a Leap Year

Input : 1900
Output : Not a Leap Year

*/
import java.util.*;
public class LeapYear {
    static void checkLeapYear(int year)
    {
        if(year%400==0 || year%4==0 && year%100!=0)
        {
            System.out.println("Leap Year");
        }
        else
        {
            System.out.println("Not a Leap Year");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        checkLeapYear(year);
    }
}
