/*
 * 54321
 * 4321
 * 321
 * 21
 * 1
 */

package Patterns;

import java.util.Scanner;

class InnerMethod4
{
    void innerMethod4(int size)
    {
        for(int i=size; i>=1; i--)
        {
            for(int j=i; j>=1; j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        
    }
}

public class Pattern4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of pattern : ");
        int size = sc.nextInt();

        InnerMethod4 im4 = new InnerMethod4();
        im4.innerMethod4(size);
    }
    
}
