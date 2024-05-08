/*
 * Print the number four in star form.
 */

package Patterns;

public class Pattern14 {

    public static void main(String[] args) {
        
        for(int i=1; i<=7; i++)
        {
            for(int j=1; j<=5; j++)
            {
                if(i==4 || j==4 || (i==2 && j==3) || (i==3 && j==2))
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
