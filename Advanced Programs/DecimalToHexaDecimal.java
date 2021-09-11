/* 

Write a program to convert decimal to hexadecimal

hexadecimal numbers uses 16 values to represent a number. Numbers from 0-9 are expressed by digits
0-9 and 10-15 are represented by characters from A-F.

Input : 116
Output : 74

Input : 10
Output : A

Input : 33
Output : 21
*/
import java.util.*;
public class DecimalToHexaDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        char hexaDecimal[] = new char[20];
        int k=0,rem;
        while(num!=0)
        {
            rem = num % 16;
            if(rem < 10)
            {
                hexaDecimal[k++] = (char)(rem + 48);
            }
            else
            {
                hexaDecimal[k++] = (char)(rem + 55);
            }
            num /= 16;
        }
        for(int j=k-1;j>=0;j--)
        {
            System.out.print(hexaDecimal[j]);
        }
    }
}
