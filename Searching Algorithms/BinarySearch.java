public class BinarySearch {
    public void binarySearch(int arr[],int key)
    {
        int start = 0;
        int end = arr.length-1;
        int mid;
        while(start<=end)
        {
            mid = (start+end)/2;
            if(arr[mid]==key)
            {
                System.out.println("Search Found...");
                return;
            }
            else if(arr[mid]<key)
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
        }
        System.out.println("Search Not Found...");
    }
    public static void main(String[] args) {
        BinarySearch obj = new BinarySearch();
        int arr[] = new int[]{4,7,21,56,89,104};
        obj.binarySearch(arr, 4);  
        obj.binarySearch(arr, 56);  
        obj.binarySearch(arr, 99);      
    }
}
