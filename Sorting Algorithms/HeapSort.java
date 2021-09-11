public class HeapSort {
    public void buildHeap(int arr[],int size)
    {
        for(int i=size/2;i>=0;i--)
        {
            heapify(arr, i, size);
        }
    }
    public void heapify(int arr[],int index,int size)
    {
        int left = 2 * index + 1;
        int right = left + 1;
        int max = index;
        if(left <= size && arr[left] > arr[max])
        {
            max = left;
        }
        if(right <= size && arr[right] > arr[max])
        {
            max = right;
        }
        if(index!=max)
        {
            int temp = arr[index];
            arr[index] = arr[max];
            arr[max] = temp;
            heapify(arr, max, size);
        }
    }
    public void heapSort(int arr[],int size)
    {
        while(size > 0)
        {
            int temp = arr[0];
            arr[0] = arr[size];
            arr[size] = temp;

            size--;
            heapify(arr, 0, size);
        }
    }
    public void print(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        HeapSort obj = new HeapSort();
        int arr[] = new int[]{54,67,12,90,42,7};
        obj.buildHeap(arr, arr.length-1); 
        obj.heapSort(arr, arr.length-1);
        obj.print(arr);       
    }
}
