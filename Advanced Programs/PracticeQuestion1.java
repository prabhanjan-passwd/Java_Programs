/* 

Program to check existence of pair with given sum in array

Input : 
a) First Line of input is sum
b) Second Line of input is No. of elements N
c) Third Line of input is, N elements separated by a singlespace

Output :
Print "Array has two elements with given sum" if required pair exists, and
Print "Array doesn't have two elements with given sum" if required pair do not exist.

Example : 
sum = 10
Number of array elements : 9
Array elements : 0 2 5 7 4 6 10 20 10
Result : Array has two elements with given sum.
6+4=10
10+0=10
*/
import java.util.*;
public class PracticeQuestion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int N = sc.nextInt();
        int arr[] = new int[N];
        int temp=0;
        for(int i=0;i<N;i++)
        {
            arr[i] = sc.nextInt();
        }        
        for(int i=0;i<N-1;i++)
        {
            for(int j=i+1;j<N;j++)
            {
                if((arr[i]+arr[j])==sum)
                {
                    temp++;
                    break;
                }
            }
            if(temp>0)
            {
                break;
            }
        }
        if(temp>0)
        {
            System.out.println("Array has two elements with given sum");            
        }
        else
        {
            System.out.println("Array doesn't have two elements with given sum");
        }
    }
}
