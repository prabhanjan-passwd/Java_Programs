class Node 
{
    int data;
    Node next;
}

public class StackUsingLinkedList {
    Node top;
    public void push(int val)
    {
        Node newNode = new Node();
        newNode.data = val;
        if(top == newNode)
        {
            newNode.next = null;
            top = newNode;       
        }
        else
        {
            newNode.next = top;
            top = newNode;
        }
    }
    public void pop()
    {
        if(top==null)
        {
            System.out.println("Stack is Empty...");
        }
        else
        {
            System.out.println("Popped Element : "+top.data);
            top = top.next;
        }
    }
    public void print()
    {
        Node temp = top;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        StackUsingLinkedList obj = new StackUsingLinkedList();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.print();
        System.out.println("************");
        obj.pop();
        obj.pop();
        obj.pop();
        obj.pop();
        obj.pop();
        obj.print();
    }
}

