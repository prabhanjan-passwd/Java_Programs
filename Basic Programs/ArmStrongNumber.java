import java.util.*;
public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number :");
        int num = sc.nextInt();
        
        int temp1 = num;
        //calculating length of number
        int length=0;
        while(temp1!=0) 
        {
            temp1 = temp1 / 10;
            length++;
        }       
        
        int temp2 = num;
        int rem,arm=0;
        while(temp2!=0)
        {
            int mul = 1;
            rem = temp2 % 10;
            for(int i=1;i<=length;i++)
            {
                mul = mul * rem;
            }
            arm = arm + mul;
            temp2 = temp2 / 10;
        }

        if(num == arm)
        {
            System.out.println("ArmStrong Number...");
        }
        else
        {
            System.out.println("Not Armstrong Number...");
        }
    }
}
