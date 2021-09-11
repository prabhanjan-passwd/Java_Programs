public class MergeSort {
    public void mergeSort(int arr[],int start,int end)
    {
        if(start < end)
        {
            int mid = (start+end)/2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);
            merge(arr, start, mid, end);
        }
    }
    public void merge(int arr[],int start,int mid,int end)
    {
        int temp[] = new int[end-start+1];
        int i=start;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=end)
        {
            if(arr[i] < arr[j])
            {
                temp[k] = arr[i];
                i++;
                k++;
            }
            else
            {
                temp[k] = arr[j];
                j++;
                k++;
            }
        } 
        while(i<=mid)
        {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while(j<=end)
        {
            temp[k] = arr[j];
            j++;
            k++;
        }
        k=0;
        for(i=start;i<=end;i++)
        {
            arr[i] = temp[k];
            k++;
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
        MergeSort obj = new MergeSort();
        int arr[] = new int[]{21,4,2,90,42,-5};
        obj.mergeSort(arr, 0, arr.length-1);
        obj.print(arr);
    }
}
