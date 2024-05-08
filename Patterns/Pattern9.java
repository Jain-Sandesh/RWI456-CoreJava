/* Print the solid rectangle
 * 
 *      * * * * *
 *      * * * * *
 *      * * * * *
 *      * * * * *
 */

package Patterns;

import java.util.Scanner;

class InnerMethod9
{
    public void innerMethod9(int row, int col)
    {
        for(int i=1; i<=row; i++)
        {
            for(int j=1; j<=col; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

public class Pattern9 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numer of rows : ");
        int row = sc.nextInt();

        System.out.print("Enter the numer of columns : ");
        int col = sc.nextInt();

        InnerMethod9 im9 = new InnerMethod9();
        im9.innerMethod9(row, col);
    }
}
