public class QuickSort {
    public void quickSort(int arr[],int start,int end)
    {
        if(start < end)
        {
            int pIndex = partition(arr, start, end);
            quickSort(arr, start, pIndex-1);
            quickSort(arr, pIndex+1, end);
        }
    }
    public int partition(int arr[],int start,int end)
    {
        int pivot = arr[end];
        int pIndex = start;
        for(int i=start;i<end;i++)
        {
            if(pivot > arr[i])
            {
                int temp = arr[i];
                arr[i] = arr[pIndex];
                arr[pIndex] = temp;
                pIndex++;
            }
        }
        int temp = arr[end];
        arr[end] = arr[pIndex];
        arr[pIndex] = temp;
        return pIndex;
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
        QuickSort obj = new QuickSort();
        int arr[] = new int[]{56,12,44,99,-9,31};
        obj.quickSort(arr, 0, arr.length-1);
        obj.print(arr);
    }
}
