class Node
{
    int data;
    Node next;
}
public class QueueUsingLinkedList {
    Node front,rear;
    public void enqueue(int val)
    {
        Node newNode = new Node();
        newNode.data = val;
        newNode.next = null;
        if(front== null && rear==null)
        {
            front = rear = newNode;
        }
        else
        {
            rear.next = newNode;
            rear = newNode;
        }
    }
    public void dequeue()
    {
        if(front==null)
        {
            System.out.println("Queue is Empty...");
            return;
        }
        else
        {
            System.out.println("Dequeued Element : "+front.data);
            front = front.next;
            if(front==null)
            {
                rear=null;
            }
        }
    }
    public void print()
    {
            if(front==null)
            {
                System.out.println("Queue is Empty...");
                return;
            }
            Node temp = front;
            while(temp!=null)
            {
                System.out.print(temp.data+" -> ");
                temp = temp.next;
            }
            System.out.println("null");
    }
    public static void main(String[] args) {
        QueueUsingLinkedList list = new QueueUsingLinkedList();
        list.print();        
        list.enqueue(10);
        list.enqueue(20);
        list.enqueue(30);
        list.enqueue(40);
        list.print();
        list.dequeue();
        list.dequeue();
        list.dequeue();
        list.dequeue();
        list.print();
    }
}
