// Take an array of number as input and check if it is an array sorted in ascending order.

package Array;

import java.util.Scanner;

public class ArrayQ4 {
    
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


        boolean flag = true;

        //for traversing
        for(int i=0; i<size-1; i++) // size-1 is used for termination of condition
        {
            // for checking given array is in descending order.
            if(arr[i] > arr[i+1])
            {
                flag = false;
            }
        }

        if(flag == true)
        {
            System.out.println("Given array is sorted in ascending order.");
            
            //display array elements
            System.out.println("Given array is :-");
            for(int i=0; i<size; i++)
            {
                System.out.print("{ " + arr[i] + "}");
            }
            System.out.println();

        }

        else
        {
            System.out.println("Given array is not sorted in ascending order.");
            //display array elements
            // System.out.println("Given array is :-");
            // for(int i=0; i<size; i++)
            // {
            //     System.out.print("{ " + arr[i] + "}");
            // }
            // System.out.println();
        }

    }
}
