/* 

Given a positive integer N, print count of set bits in it.

Example 1 :
Input : 6
Output : 2
(Binary representation of 6 is 110, so the count of set bit is 2)

Example 2 :
Input : 8
Output : 1
(Binary representation of 8 is 1000, so the count of set bit is 1)
*/
import java.util.*;
public class CountSetBits {
    static int countSetBits(int num)
    {
        int arr[] = new int[20];
        int k=0;
        while(num!=0)
        {
            arr[k++]= num % 2;
            num /= 2;
        }
        int count = 0;
        for(int i=0;i<k;i++)
        {
            if(arr[i]==1)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(countSetBits(num));
    }
}
