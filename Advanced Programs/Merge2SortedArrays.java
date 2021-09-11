/* 
Write a program to merge two sorted arrays, the
idea is to take two sorted arrays and merge them
such that the resultant array is also sorted.   
*/
import java.util.*;
public class Merge2SortedArrays {
    static void mergeTwoArrays(int arr1[],int arr2[])
    {
        int i=0;
        int j=0;
        int temp[] = new int[arr1.length+arr2.length];
        int k=0;
        while(i < arr1.length && j < arr2.length)
        {
            if(arr1[i] <= arr2[j])
            {
                temp[k++] = arr1[i++];
            }
            else
            {
                temp[k++] = arr2[j++];
            }
        }
        while(i < arr1.length)
        {
            temp[k++] = arr1[i++];
        }
        while(j < arr2.length)
        {
            temp[k++] = arr2[j++];
        }
        printArray(temp);
    }
    static void printArray(int arr[])
    {
        for(int values : arr)
        {
            System.out.print(values+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array 1 : ");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1]; 
        System.out.println("Enter Elements in Array 1 : ");
        for(int i=0;i<n1;i++)
        {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter Size of Array 2 : ");
        int n2 = sc.nextInt();
        int arr2[] = new int[n2]; 
        System.out.println("Enter Elements in Array 2 : ");
        for(int i=0;i<n2;i++)
        {
            arr2[i] = sc.nextInt();
        }
        mergeTwoArrays(arr1, arr2);
    }
}
