/*Print the half pyramid
 * 
 *      *
 *      * *
 *      * * *
 *      * * * *
 *      * * * * *
 */

package Patterns;

import java.util.Scanner;

class InnerMethod11
{
    public void innerMethod11(int size)
    {
        for(int i=1; i<=size; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

public class Pattern11 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of pattern : ");
        int size = sc.nextInt();

        InnerMethod11 im11 = new InnerMethod11();
        im11.innerMethod11(size);
    }
    
}
