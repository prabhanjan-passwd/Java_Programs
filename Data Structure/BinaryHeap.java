public class BinaryHeap {
    static int arr[] = new int[]{10,20,40,30,80,60,50};
    static int size = arr.length - 1;
    public void buildHeap(int arr[],int size)
    {
        for(int i=size/2;i>=0;i--)
        {
            heapify(arr,i,size);
        }
    }   
    public void heapify(int arr[],int index,int size) 
    {
        int left = 2 * index + 1;
        int right = left + 1;
        int max = index;
        if(left<=size && arr[left] > arr[max])
        {
            max = left;
        }
        if(right<=size && arr[right] > arr[max])
        {
            max = right;
        }
        if(max!=index)
        {
            int temp = arr[max];
            arr[max] = arr[index];
            arr[index] = temp;
            heapify(arr, max, size);
        }
    }
    public void deleteMax()
    {
        int temp = arr[0];
        arr[0] = arr[size];
        arr[size] = temp;
        size--;
        heapify(arr, 0, size);
    }
    public void print()
    {
        for(int i=0;i<=size;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        BinaryHeap obj = new BinaryHeap();
        obj.buildHeap(arr, size);
        obj.print();
        obj.deleteMax();
        obj.deleteMax();
        obj.print();
    }
}
