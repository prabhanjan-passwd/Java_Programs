import java.util.Scanner;
public class ArithmeticOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number :");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number :");
        int num2 = sc.nextInt();
        System.out.println("Addition : "+(num1+num2));
        System.out.println("Substraction : "+(num1-num2));
        System.out.println("Multiplication : "+(num1*num2));
        System.out.println("Division : "+(float)num1/num2);
        System.out.println("Modulus : "+(num1%num2));
    }
}
