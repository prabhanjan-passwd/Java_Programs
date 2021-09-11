/* 

Given an array of integers, the task is to find whether its possible to
construct an integer using all the digits of these numbers such that it
would be divisible by 3. if it is possible then print '1' or print '0'.

Input : arr[] = {40,50,90}
Output : 1

Input : arr[] = {1,4}
Output : 0

*/
import java.util.*;
public class TcsQuestion4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int rem=0;
        System.out.println("Enter Elements : ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            rem = (arr[i] + rem) % 3;
        }
        if(rem==0)
        {
            System.out.println("1");
        }
        else
        {
            System.out.println("0");
        }
    }
}

/* 

Explanation : 

40,50,90

1) 40 % 3 = 1
2) now add this 1 with next number and calculate remainder divide by 3
    ( 50 + 1 ) % 3 = 51 % 3 = 0
3) now add this 0 with next number and calculate remainder divide by 3
    ( 90 + 0 ) % 3 = 90 % 3 = 0
4) last remainder is 0, hence it is divisible by 3. 

**************************************************************************
30,20,80

1) 30 % 3 = 0
2) now add this 0 with next number and calculate remainder divide by 3
    ( 20 + 0 ) % 3 = 20 % 3 = 2
3) now add this 2 with next number and calculate remainder divide by 3
    ( 80 + 2 ) % 3 = 82 % 3 = 1
4) last remainder is 1, hence it is not divisible by 3. 
**************************************************************************
arr[] = {40,50,90}   rem =0

1) First Iteration
    rem = (arr[0] + rem) % 3
        = (40 + 0 ) % 3
    rem = 1

2) Second Iteration
    rem = (arr[1] + rem) % 3
        = (50 + 1) % 3
        = 51 % 3
    rem = 0

3) Third Iteration 
    rem = (arr[2] + rem) % 3
        = (90 + 0) % 3
        = 90 % 3
    rem = 0

    if last_remainder is 0 then it is divisible by 3,then print '1'.
    if last_remainder is not 0 then it is not divisible by 3, then print '0'.
*/