/* 

1
2 6
3 7 10
4 8 11 13
5 9 12 14 15

*/ 
import java.util.*;
public class Pattern22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int no = i;
            for(int j=1;j<=i;j++)
            {
                System.out.print(no+" ");
                no = no + n - j;
            }            
            System.out.println();
        }
    }
}
