/*
 * 1
 * 12
 * 123
 * 1234
 * 12345
 */

package Patterns;

import java.util.Scanner;

class InnerMethod3
{
    void innerMethod3(int size)
    {
        for(int i=1; i<=size; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

public class Pattern3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of pattern : ");
        int size = sc.nextInt();

        InnerMethod3 im3 = new InnerMethod3();
        im3.innerMethod3(size);
    }
    
}
