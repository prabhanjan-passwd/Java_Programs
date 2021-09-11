/* 

Write a program to print below format 

Input : 4
Output : 

1
2*2
3*3*3
4*4*4*4
4*4*4*4
3*3*3
2*2
1

*/
import java.util.*;
public class NumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(i+" * ");
            }
            System.out.print(i);
            System.out.println();
        }
        for(int i=n;i>=1;i--)
        {            
            for(int j=i-1;j>=1;j--)
            {
                System.out.print(i+" * ");
            }
            System.out.print(i);
            System.out.println();
        }
    }
}
