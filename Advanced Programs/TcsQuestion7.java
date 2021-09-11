/* 

You are a traveller, lost in a jungle. But you have the map with you. And you remember the
route you travelled so you will backtrack and reach the starting point. your task is to print
the starting point.

Input : 
a) First line of test case consist of two integers X,Y denoting of your current location
b) Second line of test case consist of an integer N denoting of number of paths you travelled.
c) Third line of test case consist of 2*N spaced integers Xi,Yj denoting the points at 
the paths you travelled.

Output :
Print the starting point in respective line.

Sample Test case :
Input :
1 1      denoting of your current location 
2        denoting of number of paths you travelled
1 0 0 1  denoting the points at the paths you travelled

Output : 
0 0      starting point
*/
import java.util.*;
public class TcsQuestion7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cx = sc.nextInt();
        int cy = sc.nextInt();
        int n = sc.nextInt();
        while(n!=0)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            cx = cx - x;
            cy = cy - y;
            n--;
        }
        System.out.println(cx+" "+cy);
    }
}
