public class QueueUsingArray {
    static int size = 5;
    static int arr[] = new int[size];
    static int front=0,rear=0;
    public void enqueue(int val)
    {
        if(rear==size)
        {
            System.out.println("Queue is Full...");
        }
        else
        {
            arr[rear] = val;
            rear++;
        }
    }
    public void dequeue()
    {
        if(front==rear)
        {
            System.out.println("Queue is Empty...");
        }
        else
        {
            System.out.println("Dequeued Element : "+arr[front]);
            front++;
        }
    }
    public void print()
    {
        for(int i=front;i<rear;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        QueueUsingArray obj = new QueueUsingArray();
        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        obj.enqueue(40);
        obj.enqueue(50);
        obj.enqueue(100);
        obj.print();
        obj.dequeue();
        obj.dequeue();
        obj.dequeue();
        obj.dequeue();
        obj.dequeue();
        obj.dequeue();
        obj.print();
    }
}
