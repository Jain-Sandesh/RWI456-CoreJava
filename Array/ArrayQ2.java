// Take an array of names as input from the user and print them on the screen.

package Array;

import java.util.Scanner;

public class ArrayQ2 {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();

        String names[]=new String[size];

        //input
        System.out.print("Enter the names with space between each name :- ");
        for(int i=0; i<size; i++)
        {
            names[i] = sc.next();
        }

        //output
        for(int i=0; i<size; i++)
        {
            System.out.println("Name " + (i+1) + " is : " + names[i] + ".");
        }
    }
}
