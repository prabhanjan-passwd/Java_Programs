/* 

write a program to find out distance between two points if co-ordinates of two points are given.    
Input : 3 4 7 7 
Output : 5

Input : 3 4 4 3
Output : 1.41421

Formula = sqrt((x2 - x1)^2 + (y2 - y1)^2)
Example : 
    x1 = 3 , y1= 2 , x2 = 5 , y2 = 6
    = sqrt((x2 - x1)^2 + (y2 - y1)^2)
    = sqrt((5-3)^2 + (6-2)^2)
    = sqrt(2^2 + 4^2)
    = sqrt(4+16)
    = sqrt(20)
    = 4.47
*/
import java.util.*;
public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[4];
        for(int i=0;i<4;i++)
        {
            arr[i] = sc.nextInt();
        }
        int r1 = arr[2] - arr[0];
        int r2 = arr[3] - arr[1];

        int sum = 0, mul = 1;
        for(int j=1;j<=2;j++)
        {
            mul = mul * r1;
        }
        sum += mul;
        mul=1;
        for(int j=1;j<=2;j++)
        {
            mul = mul * r2;
        }
        sum = sum + mul;
        System.out.println(Math.sqrt(sum));
    }
}
