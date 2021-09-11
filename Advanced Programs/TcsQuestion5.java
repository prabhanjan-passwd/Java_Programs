/* 

Given two positive integers N and X, where N is the number of total patients and X is the
time duration(in minutes) after which a new patient arrives. Also, doctor will give only 10
minutes to each patient. The task is to calculate the time (in minutes) the last patient needs
to wait.

Input : The input denote the total number of patients N and time interval X(in minutes) in which the
next patients are visiting.

Output : Output the waiting time of last patient.

Input : 4 5
Output : 15

Input : 5 3
Output : 28

*/
import java.util.*;
public class TcsQuestion5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        System.out.println((10-X)*(N-1));
    }
}

/* 

Explanation :

N = 4  number of total patients
X = 5  time duration(in minutes) after which a new patient arrives

Patient Arrived | Treatment start | Treatment end | Waiting Time
------------------------------------------------------------------
t=0             | t=0             | t=10          |  w = 0
------------------------------------------------------------------
t=5             | t=10            | t=20          |  w = 5
------------------------------------------------------------------
t=10            | t=20            | t=30          |  w = 10
------------------------------------------------------------------
t=15            | t=30            | t=40          |  w = 15
------------------------------------------------------------------   

w = 15

            5 * 3 = 15
           /     \
          /       \
        (10-X)    (N-1)
        
*/