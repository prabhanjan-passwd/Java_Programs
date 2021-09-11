/*

Write a Program to find area of circle when diameter is given
Input : any positive integer denoting diameter
Output : area of circle with two precision points

Input : 3
Output : 7.07

Input : 5
Output : 19.62
*/
import java.util.*;
public class AreaOfCircle {
    static final float pi= 3.14f;
    static float areaOfCircle(float r)
    {
        return (pi*r*r);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diameter = sc.nextInt();
        float radius = (float)diameter / 2;
        float result = areaOfCircle(radius);
        double roundOff = (double)Math.round(result*100)/100;
        System.out.println(roundOff);
    }
}
