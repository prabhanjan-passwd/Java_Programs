/* 
Given Two numbers M and N. The task is to find the position of rightmost different bit in binary representation of
numbers.

Input :
Two space separated integers M and N

Output : 
Print the position of rightmost different bit in binary representation of numbers.

constraints :
1 <= M <= 103
1 <= N <= 103
M and N takes different values.

Example :
Input :
11 9
52 4
Output :
2
5
*/
import java.util.*;
public class TcsQuestion10 {
    static int getBitPosition(int n1,int n2)
    {
        int arr1[] = new int[20];
        int arr2[] = new int[20];
        int x=0;
        while(n1>0)
        {
            arr1[x++] = n1 % 2;
            n1 /= 2;
        }
        int y=0;
        while(n2>0)
        {
            arr2[y++] = n2 % 2;
            n2 /= 2;
        }
        y=0;
        int i;
        for(i=0;i<arr1.length;i++)
        {
            if(arr1[i]!=arr2[y++])
            {
                break;
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(getBitPosition(n1, n2));
    }
}
