/*
 * 55555
 * 4444
 * 333
 * 22
 * 1
 */

package Patterns;

import java.util.Scanner;

class InnerMethod2
{
    void innerMethod2(int size)
    {
        for(int i=size; i>=1; i--)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

public class Pattern2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of pattern : ");
        int size = sc.nextInt();

        InnerMethod2 im2 = new InnerMethod2();
        im2.innerMethod2(size);
    }
    
}
