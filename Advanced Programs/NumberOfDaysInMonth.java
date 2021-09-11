/* 

User enters date in dd-mm-yyyy format. Find out number of days in a month
(please ignore concept of leap year).

Input : Date in dd-mm-yyyy format
Output : number of days in the date entered by the user

Input : 12-03-2006
Output : 31
     
Input : 31-11-1996
Output : 30
*/
import java.util.*;
public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s1="";
        for(int i=3;i<=4;i++)
        {
            s1 = s1 + s.charAt(i); 
        }
        switch(s1)
        {
            case "01" :
                System.out.println("31");
                break;
            case "02" :
                System.out.println("28");
                break;
            case "03" :
                System.out.println("31");
                break;
            case "04" :
                System.out.println("30");
                break;
            case "05" :
                System.out.println("31");
                break;
            case "06" :
                System.out.println("30");
                break;
            case "07" :
                System.out.println("31");
                break;
            case "08" :
                System.out.println("31");
                break;
            case "09" :
                System.out.println("30");
                break;
            case "10" :
                System.out.println("31");
                break;
            case "11" :
                System.out.println("30");
                break;
            case "12" :
                System.out.println("31");
                break;
        }
    }
}
