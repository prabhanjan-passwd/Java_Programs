public class StackUsingArray {
    static int size = 5;
    static int arr[] = new int[size];
    static int top = -1;
    public void push(int val)
    {
        if(top==size-1)
        {
            System.out.println("Stack is Full...");
            return;
        }
        else
        {
            top++;
            arr[top] = val;
        }
    }
    public void pop()
    {
        if(top==-1)
        {
            System.out.println("Stack is Empty");
        }
        else
        {
            System.out.println("Popped Element : "+arr[top]);
            top--;
        }
    }
    public void print()
    {
        for(int i=top;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        StackUsingArray obj = new StackUsingArray();
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
