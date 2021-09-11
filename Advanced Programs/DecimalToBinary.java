/* 

Write a program to convert decimal to binary
Input : 7
Output : 111

Input : 10
Output : 1010

Input : 33
Output : 100001
*/
import java.util.*;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k=0;
        int arr[] = new int[20];
        while(n!=0)
        {
            arr[k++] = n % 2;
            n /= 2;
        }
        for(int i=k-1;i>=0;i--)
        {
            System.out.print(arr[i]);
        }
    }
}
