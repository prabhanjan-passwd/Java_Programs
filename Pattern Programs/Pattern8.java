/*  
      *
    * * *
  * * * * * 
* * * * * * *
*/
import java.util.*;
public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number : ");
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
    }
}
