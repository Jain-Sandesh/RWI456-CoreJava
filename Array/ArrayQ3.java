// Find the maximum and minimum number in an array of integers.

package Array;

import java.util.Scanner;

class InnerArrayQ3
{
    public void inputElements(int size, int num[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of array :-");
        for(int i=0; i<size; i++)
        {
            num[i] = sc.nextInt();
        }

    }

    public void displayArray(int size, int num[])
    {
        System.out.println("Given array is :-");
        for(int i=0; i<size; i++)
        {
            System.out.print("{ " + num[i] + " }");
        }
    }

    public void findMinAndMaxElement(int size, int num[])
    {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // finding minimum and maximum value
        for(int i=0; i<size; i++)
        {
            // for minimum
            if(num[i] < min)
            {
                min = num[i];
            }

            //for maximum
            if (num[i] > max) 
            {
                max = num[i];
            }
        }
        System.out.println();
        System.out.println("Largest number in the given array is : " + max);
        System.out.println("Smallest number in the given array is : " + min);
    }
}

public class ArrayQ3 {
    
    public static void main(String[] args) {
        
        InnerArrayQ3 a3 = new InnerArrayQ3();

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int num[]=new int[size];

        //input
        a3.inputElements(size, num);
        
        //print the array
        //a3.displayArray(size, num);

        a3.findMinAndMaxElement(size, num);        
    }
}
