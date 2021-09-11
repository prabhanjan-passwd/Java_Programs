import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number :");
        int num = sc.nextInt();
        int temp=0;
        for(int i=2;i<=num-1;i++)
        {
            if(num%i==0)
            {
                temp++;
            }
        }
        if(temp>0)
        {
            System.out.println("Not Prime Number");
        }
        else
        {
            System.out.println("Prime Number");
        }
    }
}
