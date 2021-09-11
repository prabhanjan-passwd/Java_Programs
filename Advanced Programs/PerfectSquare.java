/* 

Program to Find whether a number is perfect square or not.
Input  : Any Positive integer
Output : Print Success if input number is perfect square and failure if input number is 
         not perfect square.

Input : 625
Output : Success

Input : 1002
Output : Failure
*/
import java.util.*;
public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double result1 = Math.sqrt(num);
        int result2 = (int)result1;
        if(result1==result2)
        {
            System.out.println("Success");
        }
        else
        {
            System.out.println("Failure");
        }

    }
}

/* 

Logic Part : 
1. First calculate square root of given number
2. Now typecast the obtained square root to int 
3. if(obtained_square_root == converted_int)
    {
        SOP("Perfect square");
    }
    else
    {
        SOP("Not perfect sqaure");
    }

25(perfect square) 
    1) First calculate square root of 25 : 5
    2) Now typecast the obtained square root to int : 5
    3) if(5==5)
        {
            System.out.println("Perfect Square");
        } 
        else
        {
            System.out.println("Not perfect square");
        }

    Output : Perfect Square
    
26(not perfect square)
    1) First calculate square root of given number : 5.09
    2) Now typecast the obtained square root to int : 5
    3) if(5.09 == 5)
        {
            System.out.println("Perfect Square");
        }
        else
        {
            System.out.println("Not perfect square");
        }

    Output : Not perfect square
*/