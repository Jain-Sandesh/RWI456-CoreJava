// Q1. Take an array as i/p from the user. Search for a givven number x and print the index at which it occurs.

package Array;

import java.util.Scanner;

public class ArrayQ1 {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int a[]=new int[size];

        System.out.println("Enter the numbers of array");
        //input
        for(int i=0; i<size; i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter the number to be search : ");
        int x = sc.nextInt();
        boolean flag = false;

        for(int i=0; i<size; i++)
        {
            if(a[i] == x)
            {
                System.out.println("Number is found at index : " + i + ".");
                flag = true;
            }
        }
        if (flag == false) {
            System.out.println("Number is not present in the given array.");
        }
    }
}
