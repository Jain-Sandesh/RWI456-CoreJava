//Logic - Repeatedely swap two adjacent elements if they are in wrong order.

package SortingAlgorithms;
import java.util.Scanner;

class InnerBubbleSort
{
    //for taking elements input from user
    public void inputElements(int size, int arr[])
    {
        System.out.println("Enter the elements of array");
        Scanner sc = new Scanner(System.in);

        for(int i=0;i <size; i++)
        {
            arr[i] = sc.nextInt();
        }
    }

    //bubble sort algo
    public void innerBubbleSort(int size, int arr[])
    {
        // In Bubble Sort if there is 'n' elements then to get sorted array we have to perform '(n-1)' iterations. 
        // For this we have a variable which checks the number of iterations. Let's say 'counter'.
        // This counter variavle starts with '1' and ends up at 'size-1'.
        int counter = 1;

        while(counter < (size-1))
        {
            for(int i=0; i<(size-counter); i++)
            {
                if(arr[i] > arr[i+1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            counter ++;
        }
    }

    public void printArr(int size, int arr[])
    {
        System.out.println("The Sorted array is : -");

        System.out.print("{ ");
        for(int i=0; i<size; i++)
        {
            System.out.print(arr[i] + ", ");
        }
        System.out.print("}.");
    }
}

public class BubbleSort {

    public static void main(String[] args) {
        
        InnerBubbleSort bs = new InnerBubbleSort();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println();

        bs.inputElements(size, arr); //input the array elements
        bs.innerBubbleSort(size, arr); // sort the given array elements by bubble ort technique.

        System.out.println();

        bs.printArr(size, arr); //print those sorted elements.

    }
    
}
