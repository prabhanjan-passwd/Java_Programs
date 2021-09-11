/* 

Given a series of numbers 2,10,30,68,130..., identify the pattern in the series and help to
identify the integer at other indices. indices are starting from 1.
In`put : The input contains X(index).
Output : print number at the xth index.

Input : 8
Output : 520

Input : 12
Output : 1740
*/
import java.util.*;
public class TcsQuestion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println((n*n*n)+n);
    }
}

/* 

Explanation :
Given a series of numbers 2,10,30,68,130

1^3 + 1 = 2
2^3 + 2 = 10
3^3 + 3 = 30
4^3 + 4 = 68
5^3 + 5 = 130
*/