/* Print U in star form

 *      *            *
 *      *            * 
 *      *            *
 *        *         *     
 *           * * *
 *
 * 
 */

package Patterns;

public class Pattern23 {

    public static void main(String[] args) {
        
        for(int i=1; i<=4; i++)
        {
            for(int j=1; j<=6; j++)
            {
                if((j==1 && i<=2) || (j==6 && i<=2) || (i==4 && (j==3 || j==4)) || (i==3 && (j==2 || j==5)))
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
}
