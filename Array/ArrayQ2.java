// Take an array of names as input from the user and print them on the screen.

package Array;

import java.util.Scanner;

/**
 * InnerArrayQ2
 */
class InnerArrayQ2 
{
    public void inputNames(int size, String names[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the names with space between each name :- ");
        for(int i=0; i<size; i++)
        {
            names[i] = sc.next();
        }
    }

    public void displayNames(int size, String names[])
    {
        System.out.println("Names present in array is :- ");

        System.out.print("{ ");
        for(int i=0; i<size; i++)
        {
            System.out.print(names[i] + ", ");
        }
        System.out.print("}.");

        //Different type of display
        //  //output
        //  for(int i=0; i<size; i++)
        //  {
        //      System.out.println("Name " + (i+1) + " is : " + names[i] + ".");
        //  }
    }
    
}

public class ArrayQ2 {
    
    public static void main(String[] args) {
        
        InnerArrayQ2 a2 = new InnerArrayQ2();

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();

        String names[]=new String[size];

        a2.inputNames(size, names);
        a2.displayNames(size, names);
        
    }
}
