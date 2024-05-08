/*
 * 5
 * 44
 * 333
 * 2222
 * 11111
 */

package Patterns;

import java.util.Scanner;

class InnerMethod5
{
    void innerMethod5(int size)
    {
        for(int i=size; i>=1; i--)
        {
            for(int j=i; j<=size; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }

    }
}

public class Pattern5 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of pattern : ");
        int size = sc.nextInt();

        InnerMethod5 im5 = new InnerMethod5();
        im5.innerMethod5(size);
    }
    
}
