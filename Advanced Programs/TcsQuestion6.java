/* 
Shubham wrote a sequence of words. The words are written using the rule given below:
The sequence is concatenation of one or more words consisting of English letters.
All letters in the first word are lowercase.
For each of the subsequent words, the first letter is uppercase and rest of the letters are lowercase.
You need to find the number of words in the string.

Input : A single line of input that contains the string s.
Output : Print the number of words in s.

Input : iAmShubham
Output : 3

Input : helloWorld
Output : 2

*/
import java.util.*;
public class TcsQuestion6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count=1;
        for(int i=1;i<s.length();i++)
        {
          if(s.charAt(i)>=65 && s.charAt(i)<=90)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
