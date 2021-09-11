/* 
Write a program to find middle of given linked list.

Given a Singly Linked List, find the middle of the linked list. For example, if the 
given linked list is 1 -> 2 -> 3 -> 4 -> 5 then the output should be 3.

if there are even nodes, then there would be two middle nodes, we need to print
the second middle element. For example, if given linked list is 1 -> 2 -> 3 -> 4 -> 5 -> 6
then output should be 4.
*/
import java.util.Scanner;
class Node
{
    int data;
    Node next;
}
public class MiddleElementFromLinkedList {
    Node head;
    public void addLast(int val)
    {
        Node newNode = new Node();
        newNode.data = val;
        newNode.next = null;
        if(head==null)
        {
            head = newNode;
        }
        else
        {
            Node temp = head;
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    public void print()
        {
            int start=0,end=0;
            Node temp = head;
            while(temp.next!=null)
            {
                temp = temp.next;
                end++;
            }
            int mid = (start + end) / 2;
            Node temp1 = head;
            while(temp1 != null)
            {
                if((end+1)%2==1)
                {
                    if(start == mid)
                    {
                        System.out.println(temp1.data);
                        break;
                    }
                }
                else
                {
                    if(start == mid+1)
                    {
                        System.out.println(temp1.data);
                        break;
                    }
                }
                start++;
                temp1 = temp1.next;
            }
        }
    public static void main(String[] args) {
        MiddleElementFromLinkedList list = new MiddleElementFromLinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of elements : ");
        int n = sc.nextInt();
        System.out.println("Enter Elements : ");
        for(int i=0;i<n;i++)
        {
            int element = sc.nextInt();
            list.addLast(element);
        }
        list.print();
    }
}
