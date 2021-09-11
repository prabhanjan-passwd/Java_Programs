class Node
{
    Node prev;
    int data;
    Node next;
}
public class DoublyLinkedList {
    Node head;
    public void addLast(int val)
    {
        Node newNode = new Node();
        newNode.data = val;
        newNode.next = null;
        if(head==null)
        {
            newNode.prev = null;
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
            newNode.prev = temp;
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
            System.out.println("Linked List is Empty...");
            return;
        }
        Node temp = head;
        while(temp.data != val && temp!=null)
        {   
            temp = temp.next;
        }
        if(temp==null)
        {
            System.out.println("Element Not Found...");
            return;
        }
        if(temp==head)
        {
            head = head.next;
            head.prev = null;
        }
        else if(temp.next==null)
        {
            temp.prev.next = null;
        }
        else
        {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
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
        DoublyLinkedList list = new DoublyLinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.print();        
        System.out.println("10 : "+list.search(10));
        System.out.println("20 : "+list.search(20));
        System.out.println("30 : "+list.search(30));
        System.out.println("40 : "+list.search(40));
        System.out.println("50 : "+list.search(50));
        System.out.println("****************************");
        list.delete(50);
        list.print();
    }
}
