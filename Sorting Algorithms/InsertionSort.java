public class InsertionSort {
    public void insertionSort(int arr[])
    {
        int value,index;
        for(int i=1;i<arr.length;i++)
        {
            value = arr[i];
            index = i;
            while(index > 0 && arr[index-1] > value)
            {
                arr[index] = arr[index-1];
                index--;
            }
            arr[index] = value;
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
        InsertionSort obj = new InsertionSort();
        int arr[] = new int[]{10,77,44,21,90,-5};
        obj.insertionSort(arr);
        obj.print(arr);
    }
}
