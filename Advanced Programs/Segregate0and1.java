/* 

Segregate 0s and 1s in an array.
you are given an array of 0's and 1's in random order. Segregate 0s on left side and 1s on
right side of the array. Traverse the array only once.
Input : 0 1 0 1 0 0
Output : 0 0 0 0 1 1

Input : 0 1 0 1 0 0 1 1 1 0
Output : 0 0 0 0 0 1 1 1 1 1
*/
import java.util.*;
public class Segregate0and1 {
    static void segregate0and1(int arr[])
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                count++;
            }
        }
        for(int i=0;i<count;i++)
        {
            arr[i] = 0;
        }
        for(int i=count;i<arr.length;i++)
        {
            arr[i] = 1;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        segregate0and1(arr);
    }        
}
