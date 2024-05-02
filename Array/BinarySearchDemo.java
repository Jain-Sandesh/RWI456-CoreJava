// Binary Search

package Array;

import java.util.Scanner;

/**
 * InnerBinarySearchDemo
 */
class InnerBinarySearchDemo {

    int binarySearch(int key, int size, int arr[])
    {
        int start=0;
        int end=size;

        while (start <= end)
        {
            int mid = (start + end)/2;

            if(arr[mid] == key)
            {
                return (mid+1);
            }
            else if(arr[mid] > key)
            {
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }

        }
        return (0);
    }
}

public class BinarySearchDemo {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int arr[]=new int[size];

        //input
        System.out.println("Enter the elements of array :-");
        for(int i=0; i<size; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println();
        System.out.print("Enter the key to be searched : ");
        int key = sc.nextInt();

        InnerBinarySearchDemo obj=new InnerBinarySearchDemo();

        if(obj.binarySearch(key, size, arr) == 0)
        {
            System.out.println("The key" + key +" you entered is not present in the given array.");
        }
        else
        {
            System.out.println("The key " + key + " is present at index : " + obj.binarySearch(key, size, arr) + ".");
        }

    }
}
