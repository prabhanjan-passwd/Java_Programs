/* 

1 2 3 
6 5 4 
7 8 9
12 11 10
13 14 15 
*/
import java.util.*;
public class Pattern21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number : ");
        int n = sc.nextInt();
        int count=1;
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
                for(int j=1;j<=3;j++)
                {
                    System.out.print(count+" ");
                    count++;
                }
                System.out.println();
            }
            if(i%2==0)
            {
                int temp = count;
                for(int j=count+2;j>=temp;j--)
                {
                    System.out.print(j+" ");
                    count++;
                }
                System.out.println();
            }

        }
    }
}
