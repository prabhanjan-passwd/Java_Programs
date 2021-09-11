/* 
    Program to add two fractions and display their sum in reduced form

    Input : 1 2 3 2
    Output : 2 1

    Input : 1 3 3 9
    Output : 2 3
*/
import java.util.*;
public class SumOfTwoFraction {
    static int gcd(int a,int b)
    {
        if(a==0)
        {
            return b;
        }
        return gcd(b%a, a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int x = (a*d) + (b*c);
        int y = (b*d);
        System.out.print(x/gcd(x, y)+" ");
        System.out.print(y/gcd(x, y));

    }
}

/* 
1 2 3 2

Here,
1 2 3 2 is actually  1/2 + 3/2. 

Explanation :
 1     3    (1*2) + (3*2)      2 + 6     8 = x                      
--- + --- = -------------- =  ------- = ---        
 2     2        (2*2)            4       4 = y                     
                                                 
gcd(8,4) = 4

     8                8
    ---              ---
  gcd(8,4)            4           2
-----------   ->   --------   -> ---   ->  2,1
     4                4           1
    ---              ---
  gcd(8,4)            4

*/