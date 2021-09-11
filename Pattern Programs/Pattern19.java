/* 

1
1 2 1
1 2 3 2 1
1 2 3 4 3 2 1
*/
import java.util.*;
public class Pattern19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            for(int k=i-1;k>=1;k--)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
