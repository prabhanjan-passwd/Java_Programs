/* 

There are N students in a class, each in possession of a different funny story. As the students
were getting bored in the class, they decided to come up with a game so that they can pass
their time.
They want to share the funny stories with each other by sending eletronic messages. Assume
that a sender includes all the funny stories he or she knows at the time the message is sent and
that a message may only have one addressee. what is the minimum number of messages they
need to send to guarantee that everyone of them gets all the funny stories.?

Input : An Integer N denoting the number of students
Output : Print the minimum number of messages they need to send to
guarantee that everyone of them gets all the funny stories.

Input : 5
Output : 8

Input : 15
Output : 28
*/
import java.util.*;
public class TcsQuestion3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println((N*2)-2);
    }    
}
