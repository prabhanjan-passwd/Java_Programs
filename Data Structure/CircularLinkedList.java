import java.util.*;
class Node
{
    int data;
    Node next;
}
public class CircularLinkedList {
    Node head;
    public void addLast(int val)
    {
        Node newNode = new Node();
        newNode.data = val;
        if(head == null)
        {
            newNode.next = newNode;
            head = newNode;
        }
        else
        {
            Node temp = head;
            do
            {
                temp = temp.next;
            }while(temp.next != head);
            temp.next = newNode;
            newNode.next = head;
        }
    }
    public boolean search(int val)
    {
        Node temp = head;
        do
        {
            if(temp.data == val)
            {
                return true;
            }
            temp = temp.next;
        }while(temp!=head);
        return false;
    }
    public void delete(int val)
    {
        if(head==null)
        {
            return;
        }
        if(head.data==val)
        {
            Node temp = head;
            while(temp.next != head)
            {
                temp = temp.next;
            }
            head = head.next;
            temp.next = head;
        }
        else
        {
            Node temp = head;
            while(temp.next != head)
            {
                if(temp.next.data==val)
                {
                    temp.next = temp.next.next;
                    break;
                }
                temp = temp.next;
            }
        }
    }
    public void print()
    {
        Node temp = head;
        do
        {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }while(temp!=head);
        System.out.println("null");
    }
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.print();        
        System.out.println("10 : "+list.search(10));
        System.out.println("20 : "+list.search(20));
        System.out.println("30 : "+list.search(30));
        System.out.println("40 : "+list.search(40));
        System.out.println("510 : "+list.search(510));
        list.delete(40);
        list.print();
    }
}
