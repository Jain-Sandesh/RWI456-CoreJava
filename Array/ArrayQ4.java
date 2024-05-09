// Take an array of number as input and check if it is an array sorted in ascending order.

package Array;

import java.util.Scanner;

class InnerArrayQ4
{
    boolean flag = true;

    public void inputElements(int size, int arr[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of array :-");
        for(int i=0; i<size; i++)
        {
            arr[i] = sc.nextInt();
        }
    }

    public void displayArray(int size, int arr[])
    {
        System.out.println("Given array is :-");
        System.out.print("{ ");
        for(int i=0; i<size; i++)
        {
            System.out.print(arr[i] + ", ");
        }
        System.out.print("}.");   
    }

    public boolean isSortedInAscending(int size, int arr[])
    {
        //for traversing
        for(int i=0; i<size-1; i++) // size-1 is used for termination of condition
        {
            // for checking given array is in descending order.
            if(arr[i] > arr[i+1])
            {
                flag = false;
            }
        }
        return flag;
    }

    public void displaySortedArrayOnly(int size, int arr[])
    {
        boolean x = isSortedInAscending(size, arr);

        if(x == true)
        {
            System.out.println("Given array is sorted in ascending order.");
            
            displayArray(size, arr);
        }

        else
        {
            System.out.println("Given array is not sorted in ascending order.");

            displayArray(size, arr);
        }

    }
}

public class ArrayQ4 {
    
    public static void main(String[] args) {
        
        InnerArrayQ4 a4 = new InnerArrayQ4();

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int arr[]=new int[size];

        //input
        a4.inputElements(size, arr);
        a4.displaySortedArrayOnly(size, arr);
        
    }
}
