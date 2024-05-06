/*
 * 1
 * 22
 * 333
 * 4444
 * 55555
 */

package Patterns;

import java.util.Scanner;

class InnerMethod1
{
    void innerMethod1(int size)
    {
        for(int i=1; i<=size; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

public class Pattern1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of pattern : ");
        int size = sc.nextInt();

        System.out.println();

        InnerMethod1 im1 = new InnerMethod1();
        im1.innerMethod1(size);
    }
    
}
