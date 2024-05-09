// Linear Search in Java

package SeachingAlgorithms;

import java.util.Scanner;

class InnerLS
{
    int linearSearch(int key,int size, int arr[])
    {
        // searching in linear manner
        for(int i=0; i<size; i++)
        {
            if(arr[i] == key)
            {
                return (i+1);
            }
        }
        return 0;
    }
}

public class LinearSearchDemo {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        //input
        System.out.println("Enter the elements of array :-");
        for(int i=0; i<size; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println();

        System.out.print("Enter the key to be find : ");
        int key = sc.nextInt();

        InnerLS obj=new InnerLS();

        if(obj.linearSearch(key, size, arr) == 0)
        {
            System.out.println("The key " + key + " you entered is not present in the given array.");
        }
        else
        {
            System.out.println("The key " + key + " is found at index : " + obj.linearSearch(key, size, arr) + ".");
        }
        
    }
}
