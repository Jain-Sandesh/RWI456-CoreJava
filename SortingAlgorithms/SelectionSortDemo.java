// Logic - Find the minimum element in the unsorted array and swap it with the element int he beginning

package SortingAlgorithms;

import java.util.Scanner;

class InnerSelectionSort // class is created for sorting and display sorted array.
{
    // for sorting the given array by selection sort
    void selectionSort(int size, int arr[])
    {
        for(int i=0; i<(size-1); i++)
        {
            for(int j=(i+1); j<size; j++)
            {
                if(arr[j] < arr[i])
                {
                    //swapping
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    // display the array after sorting
    void displayArray(int size, int arr[])
    {
        System.out.println("The sorted array is :- ");
        for(int i=0; i<size; i++)
        {
            System.out.print("{" + arr[i] + "} ");
        }
    }
}

public class SelectionSortDemo {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();

        int arr[]=new int[size]; //creating array

        //input array elements
        System.out.println("Enter the elements of array :-");
        for(int i=0; i<size; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println();

        // display the array before sorting
        System.out.println("The given array is :-");
        for(int i=0; i<size; i++)
        {
            System.out.print("{" + arr[i] + "} ");
        }
        System.out.println();

        InnerSelectionSort obj=new InnerSelectionSort();
        obj.selectionSort(size, arr);
        System.out.println(); // sorting the array by selection sort technique.
        obj.displayArray(size, arr); //display array after sorting.
    }
}
