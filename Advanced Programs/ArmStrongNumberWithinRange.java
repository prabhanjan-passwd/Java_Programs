/* 

Program to print all armstrong number in a given range
Input : Two integers depicting the range
Output : Print all the armstrong number separated by space in the given range

Input : 100 200
Output : 153
*/
import java.util.*;
public class ArmStrongNumberWithinRange {
    static void printArmStrongNumbers(int start,int end)
    {
        for(int n = start;n<=end;n++)
        {
             int temp1 = n;
             int length = 0;
             while(temp1!=0)
             {
                 length++;
                 temp1 /= 10;
             }
             int temp2 = n;
             int rem,sum=0;
             while(temp2!=0)
             {
                int mul=1;
                rem = temp2 % 10;
                for(int i=1;i<=length;i++)
                {
                    mul *= rem;
                }
                sum += mul;
                temp2 /= 10;
            }    
            if(n==sum)
                System.out.println(n);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        printArmStrongNumbers(n1,n2);
    }
}
