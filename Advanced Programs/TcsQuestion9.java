/* 
    Write a function to return position of first 1 from right to left,in binary representation of an
    integer.    

    Input : 18   Binary representation 010010
    Output : 2

    Input : 19   Binary representation 010011
    Output : 1
*/
import java.util.*;
public class TcsQuestion9 {
    static int printPositionOf1(int n)
    {
        int arr[] = new int[20];
        int k=0;
        while(n>0)
        {
            arr[k++] =  n % 2;
            n /= 2;
        }
        int i=0;
        for(i=0;i<k;i++)
        {
            if(arr[i]==1)
            {
                break;
            }
       
        }
        return i+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(printPositionOf1(n));
    }
}
