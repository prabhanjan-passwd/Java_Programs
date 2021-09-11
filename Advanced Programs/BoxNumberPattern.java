/* 

Write a program to print box number pattern 0f 1 and 0.
Input : Given a single line input separated by space. 
            N1 denotes number of rows
            N2 denotes number of columns
Output : print the output in the required format

Input : 5 5
Output : 
1 1 1 1 1
1 0 0 0 1
1 0 0 0 1
1 0 0 0 1
1 1 1 1 1

Input : 5 4
1 1 1 1
1 0 0 1
1 0 0 1
1 0 0 1
1 1 1 1

*/
import java.util.*;
public class BoxNumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        for(int i=1;i<=n1;i++)
        {
            for(int j=1;j<=n2;j++)
            {
                if(i>=2 && j>=2 && i<=n1-1 && j<=n2-1)
                {
                    System.out.print("0 ");
                }
                else
                {
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }        
    }
}
