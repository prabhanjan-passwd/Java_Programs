/* 
      *
    * * *
  * * * * *
* * * * * * *
  * * * * *
    * * *
      *
*/
import java.util.*;
public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Numbers : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("* ");
            }
            for(int m=2;m<=i;m++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=2;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("  ");
            }
            for(int k=n;k>=i;k--)
            {
                System.out.print("* ");
            }
            for(int m=n-1;m>=i;m--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
