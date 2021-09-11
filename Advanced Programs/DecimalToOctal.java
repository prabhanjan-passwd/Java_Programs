/* 
Write a program to convert decimal to octal.
Input : 16 
Output : 20

Input : 10
Output : 12

Input : 33
Output : 41
*/
import java.util.*;
public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[20];
        int k=0;
        while(num>=1)
        {
            arr[k++] = num % 8;
            num /= 8; 
        }
        for(int i=k-1;i>=0;i--)
        {
            System.out.print(arr[i]);
        }
    }
}
