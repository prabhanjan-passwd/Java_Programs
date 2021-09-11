import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Year :");
        int year = sc.nextInt();
        if(year%400==0 || year%4==0 && year%100!=0)
        {
            System.out.println("It Is Leap Year...");
        }
        else
        {
            System.out.println("It Is Not Leap Year...");    
        }
    }
}
