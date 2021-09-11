/* 

If ajay devgan makes a vimal packet in 'X' days,
shraddha kapoor makes a vimal packet in 'Y' days,
deepika makes a vimal packet in 'Z' days.
You need to write a program where the input x,y and z are
taken from user and the output is the number of days it will 
take to make vimal packet if all three work together.

                        xyz
number of days =  ---------------
                    xy + yz + xz
*/
import java.util.*;
public class TcsQuestion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x = sc.nextInt();
        float y = sc.nextInt();
        float z = sc.nextInt();
        System.out.println( (x*y*z) / ((x*y)+(y*z)+(x*z)));
    }
}
