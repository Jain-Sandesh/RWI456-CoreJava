/* Print the hollow rectangle
 * 
 *      * * * * *
 *      *       *
 *      *       *
 *      * * * * *
 */

package Patterns;

import java.util.Scanner;

/**
 * InnerPattern10
 */
class InnerMethod10 
{
    public void innerMethod10(int row, int col)
    {
        for(int i=1; i<=row; i++)
        {
            for(int j=1; j<=col; j++)
            {
                if(i==1 || j==1 || i==row || j==col)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  "); // we have to give two space because we put space after printing an star above
                }
            }
            System.out.println();
        }
    }
}

public class Pattern10 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numer of rows : ");
        int row = sc.nextInt();

        System.out.print("Enter the numer of columns : ");
        int col = sc.nextInt();

        InnerMethod10 im10 = new InnerMethod10();
        im10.innerMethod10(row, col);
    }
    
}
