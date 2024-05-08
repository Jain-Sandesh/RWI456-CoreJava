/*
        *
       ***
      *****
     *******
    *********
 */

package Patterns;

import java.util.Scanner;

class InnerMethod8
{
    public void innerMethod8(int size)
    {
       /*  for(int i=1; i<=size; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print( " ");

                for(int k=j; k>=1; k--)
                {
                    System.out.print(k);
                }
            }
            System.out.println();
        } */

        for(int i=1; i<size;i ++)
        {
            for(int j=i; j<size; j++)
            {
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++)
            {
                System.out.print(k);
            }
            for(int l=i-1; l>=1; l--)
            {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}

public class Pattern8 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of pattern : ");
        int size = sc.nextInt();

        InnerMethod8 im8 = new InnerMethod8();
        im8.innerMethod8(size);
    }
}
