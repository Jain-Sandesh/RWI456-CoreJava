/*
 * 1
 * 21
 * 321
 * 4321
 * 54321
 */

package Patterns;

import java.util.Scanner;

class InnerMethod7
{
    void innerMethod7(int size)
    {
        for(int i=1; i<=size; i++)
        {
            for(int j=i; j>=1; j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

public class Pattern7 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of pattern : ");
        int size = sc.nextInt();

        InnerMethod7 im7 = new InnerMethod7();
        im7.innerMethod7(size);
    }
    
}
