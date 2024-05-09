// Q1. Take an array as i/p from the user. Search for a givven number x and print the index at which it occurs.

package Array;

import java.util.Scanner;

class InnerArrayQ1
{
    public void inputElements(int size, int a[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers of array");
        //input
        for(int i=0; i<size; i++)
        {
            a[i] = sc.nextInt();
        }
    }

    public void findNum(int size, int a[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number to be search : ");
        int x = sc.nextInt();
        boolean flag = false;

        for(int i=0; i<size; i++)
        {
            if(a[i] == x)
            {
                System.out.println("Number is found at index : " + (i+1) + ".");
                flag = true;
            }
        }
        if (flag == false) {
            System.out.println("Number is not present in the given array.");
        }
    }
}

public class ArrayQ1 {
    
    public static void main(String[] args) {
        
        InnerArrayQ1 a1 = new InnerArrayQ1();

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int a[]=new int[size];

        a1.inputElements(size, a);
        a1.findNum(size, a);
        
    }
}
