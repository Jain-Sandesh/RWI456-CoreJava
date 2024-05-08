/*
 * 11111
 * 2222
 * 333
 * 44
 * 5
 */

package Patterns;

import java.util.Scanner;

class InnerMethod6
{
    void innerMethod6(int size)
    {
        for(int i=1; i<=size; i++)
        {
            for(int j=i; j<=size; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

public class Pattern6 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of pattern : ");
        int size = sc.nextInt();

        InnerMethod6 im6 = new InnerMethod6();
        im6.innerMethod6(size);
    }
    
}
