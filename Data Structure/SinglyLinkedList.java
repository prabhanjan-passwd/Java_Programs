import java.util.*;
class Node
{
    int data;
    Node next;
}
public class SinglyLinkedList {
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
            while(temp.next!=null)
            {
                temp = temp.next;
            }
            temp.next = newNode;
        }      
    }
    public boolean search(int val)
    {
        Node temp = head;
        while(temp!=null)
        {
            if(temp.data == val)
            {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    public void delete(int val)
    {
        if(head==null)
        {
            return;
        }
        if(head.data == val)
        {
            head = head.next;
        }
        else
        {
            Node temp = head;
            while(temp!=null)
            {
                if(temp.next.data == val)
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
            while(temp!=null)
            {
                System.out.print(temp.data+" -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
        
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.print();
        list.delete(40);
        list.print();
    }
}
