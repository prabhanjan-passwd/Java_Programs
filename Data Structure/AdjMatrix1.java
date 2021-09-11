// Directed graph using adjacency matrix
public class AdjMatrix1 {
    public void addEdge(int arr[][],int src,int dest)
    {
        arr[src][dest] = 1;
    }   
    public boolean hasEdge(int arr[][],int src,int dest)
    {
        if(arr[src][dest]==1)
        {
            return true;
        }
        return false;
    } 
    public void removeEdge(int arr[][],int src,int dest)
    {
        arr[src][dest] = 0;
    }
    public void print(int arr[][])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        AdjMatrix1 obj = new AdjMatrix1();
        int arr[][] = new int[5][5];
        obj.addEdge(arr, 0, 1);
        obj.addEdge(arr, 0, 2);
        obj.addEdge(arr, 0, 3);
        obj.addEdge(arr, 2, 3);
        obj.addEdge(arr, 3, 4);
        obj.addEdge(arr, 1, 3);
        obj.addEdge(arr, 1, 4);
        obj.print(arr);
        System.out.println("****************");
    }
}
