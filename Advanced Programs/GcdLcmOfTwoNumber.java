import java.util.*;
public class GcdLcmOfTwoNumber {
    public int Gcd(int a,int b)
    {
        if(a==0)
        {
            return b;
        }
        return Gcd(b%a, a);
    }
    public int Lcm(int a,int b)
    {
        return a*b/Gcd(a, b);
    }
    public static void main(String[] args) {
        GcdLcmOfTwoNumber obj = new GcdLcmOfTwoNumber();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("GCD : "+obj.Gcd(a, b));
        System.out.println("LCM : "+obj.Lcm(a, b));
    }
}
