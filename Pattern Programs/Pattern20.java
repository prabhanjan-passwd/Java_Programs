/* 

5 4 3 2 1
5 4 3 2
5 4 3 
5 4
5

*/
import java.util.*;
public class Pattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int count = n;
            for(int j=n;j>=i;j--)
            {
                System.out.print(count+" ");
                count--;
            }
            System.out.println();
        }
    }
}
