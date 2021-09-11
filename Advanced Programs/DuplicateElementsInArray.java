/* 
Given a sorted array with many duplicate elements, the problem is to find indexes of first and
last occurrences of an element X in the given array.
Start the array index from 0. if element X is not present in the array, print "NO OCCURENCES".

Input : 
a) First Line of input is number of elements(N)
b) N array elements in second line
c) Number to be Searched(X)

Input :
N = 9 
arr[N] = {1,3,5,5,5,5,67,123,125}
x = 5

Output : 
    First Occurrence = 2
    Last Occurrence = 5

***********************************************
Input :
N = 9 
arr[N] = {1,3,5,5,5,5,67,123,125}
x = 67

Output : 
    First Occurrence = 6
    Last Occurrence = 6
***********************************************
Output
Example :
There are 10 elements in an array [1 2 2 2 2 3 4 8 8 8]
and element to be searched(x) is 8.
So, output is 7 9
element(8) occurs first at 7th index and occurs last at 9th index.
*/
import java.util.*;
public class DuplicateElementsInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // number of elements
        int arr[] = new int[N]; // array declaration
        
        // inserting elements in array
        for(int i=0;i<N;i++)
        {
            arr[i] = sc.nextInt();
        }
        // X is the element to be searched
        int X = sc.nextInt();

        int first = -1, last = -1;

        //searching first occurrence
        for(int i=0;i<N;i++)
        {
            if(arr[i]==X)
            {
                first = i;
                break;
            }
        }
   
        // searching last occurrence
        if(first != -1)
        {
            for(int j=first;j<N;j++)
            {
                if(X==arr[j])
                {
                    last = j;
                }
            }
        }
        if(first==-1 && last==-1)
        {
            System.out.println("NO OCCURENCES");
        }
        else
        {
            System.out.println("First Occurrence = "+first);
            System.out.println("Last Occurrence = "+last);
        }
    }      
}

