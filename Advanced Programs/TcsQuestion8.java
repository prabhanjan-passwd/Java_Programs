/* 

MS Excel columns have a pattern like A,B,C,...,Z,AA,AB,AC,...,AZ,BA,BB,...
ZZ,AAA,AAB...etc. In other words, column 1 is named as "A", column 2 as "B",
column 27 as "AA".

Given a column number, find its corresponding excel column name. The following are
more examples.

Input :    Output :
26         Z
51         AY
52         AZ
80         CB
676        YZ
702        ZZ
705        AAC
*/
import java.util.Scanner;
public class TcsQuestion8
{
    static void printString(int n)
    {
        char str[] = new char[50];
        int i=0;
        while(n>0)
        {
            int rem = n % 26;
            if(rem==0)
            {
                str[i++] = 'Z';
                n = (n/26) - 1;
            }
            else
            {
                str[i++] = (char)((rem-1) + 'A');
                n /= 26;
            }
        }
        reverseArray(str, 0, str.length-1);
        for(int j=0;j<str.length;j++)
        {
            System.out.print(str[j]);
        }
    }
    static void reverseArray(char arr[],int start,int end)
    {
        while(start<end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = (char)temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        int n = sc.nextInt();
        printString(n);
    }
}