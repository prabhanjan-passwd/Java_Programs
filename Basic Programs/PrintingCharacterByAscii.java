import java.util.*;
public class PrintingCharacterByAscii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any ASCII Number :");
        int num = sc.nextInt();
        System.out.println("Character is "+(char)num);
    }
}
