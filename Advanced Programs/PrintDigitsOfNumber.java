/* 

Print digits of a given number in same order.
Input : Any positive integer
Output : Print digits of the input number in same order in space separated

Input : 3452897
Output : 3 4 5 2 8 9 7

Input : 2017
Output : 2 0 1 7 
*/
import java.util.*;
public class PrintDigitsOfNumber {
    static void printDigits(int num)
    {
        int k=0,rem;
        int arr[] = new int[10];
        while(num!=0)
        {
            rem = num % 10;
            arr[k] = rem;
            k++;
            num = num / 10;
        }
        for(int i=k-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printDigits(num);
        
    }
}
