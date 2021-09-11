public class LinearSearch {
    public void linearSearch(int arr[],int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                System.out.println("Search Found...");
                return;
            }
        }
        System.out.println("Search Not Found...");
    }
    public static void main(String[] args) {
        LinearSearch obj = new LinearSearch();
        int arr[] = new int[]{30,21,45,1,90,101};
        obj.linearSearch(arr, 30);
        obj.linearSearch(arr, 90);
        obj.linearSearch(arr, 7);
    }
}
