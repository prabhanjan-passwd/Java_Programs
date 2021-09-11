/* 
Jethalal likes chocolates and he loves to try different ones. There are N shops in a market labelled
from 1 to N and each shop offers a different variety of chocolate. Jethalal starts from ith shop and goes
ahead to each and every shop. But as there are too many shops Jethalal would like to know how many more 
shops he has to visit. You have been given L denoting numbers of bits required to represent N. You need
to return the maximum number of shops he can visit.

Input : i=2 L=3
Output : 6
Explanation : N = 2^L (2^3 = 8) 
There are 3 bits so N = 8
hence Jethalal can visit 8 - 2 = 6 more shops.

Input : i=1 L=2
Output : 3
Explanation : N = 2^L (2^2 = 4) 
There are 2 bits so N = 4
Hence Jethalal can visit 4 - 1 = 3 more shops.
*/
import java.util.*;
public class Jethalal {
    static int calculateNumberOfShops(int i,int L)
    {
        int mul=2;
        for(int j=1;j<L;j++)
        {
            mul *= 2;
        }
        int N = mul;
        return (N-i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int L = sc.nextInt();
        System.out.println(calculateNumberOfShops(i, L));
    }
}
