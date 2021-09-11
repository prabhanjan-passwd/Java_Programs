class Node 
{
    int data;
    Node next;
}
public class AdjList {
    int size = 5;
    Node adjList[] = new Node[size];
    public void addEdge(int src,int dest)
    {
        Node newNode = new Node();
        newNode.data = dest;
        if(adjList[src]==null)
        {
            adjList[src] = newNode;
            newNode.next = null;
        }
        else
        {
            Node temp = adjList[src];
            while(temp.next!=null)
            {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = null;
        }
    }
    public void removeEdge(int src,int dest)
    {
        if(adjList[src] == null)
        {
            return;
        }
        if(adjList[src].data == dest)
        {
            adjList[src] = adjList[src].next;
        }
        else
        {
            Node temp = adjList[src];
            while(temp.next != null)
            {
                if(temp.next.data == dest)
                {
                    temp.next = temp.next.next;
                    break;
                }
                else
                {
                    temp = temp.next;
                }
            }
        }
    }
    public boolean hasEdge(int src,int dest)
    {
        Node temp = adjList[src];
        while(temp != null)
        {
            if(temp.data == dest)
            {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    public void print()
    {
        for(int i=0;i<adjList.length;i++)
        {
            System.out.print("adjList["+i+"] -> ");
            Node temp = adjList[i];
            while(temp!=null)
            {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }
    public static void main(String[] args) {
        AdjList list = new AdjList();
        list.addEdge(0, 1);
        list.addEdge(0, 2);
        list.addEdge(0, 3);
        list.addEdge(1, 3);
        list.addEdge(1, 4);
        list.addEdge(2, 3);
        list.addEdge(3, 4);
        list.print();
        System.out.println("0 - 1 : "+list.hasEdge(0,1));
        System.out.println("0 - 2 : "+list.hasEdge(0,2));
        System.out.println("0 - 3 : "+list.hasEdge(0,3));
        System.out.println("1 - 3 : "+list.hasEdge(1,3));
        System.out.println("1 - 4 : "+list.hasEdge(1,4));
        System.out.println("2 - 3 : "+list.hasEdge(2,3));
        System.out.println("3 - 4 : "+list.hasEdge(3,4));
        System.out.println("2 - 4 : "+list.hasEdge(2,4));
        System.out.println("**************************");
        list.removeEdge(3, 4);
        list.removeEdge(2, 3);
        list.print();
    }    
}
