/*
 * Print the number three in star form.
 */

package Patterns;

public class Pattern13 {

    public static void main(String[] args) {
        
        for(int i=1; i<=7; i++)
        {
            for(int j=1; j<=5; j++)
            {
                if(i==1 || i==4 || i==7 || (i<=4 && j==5) || (i>=4 && j==5))
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print( "  ");
                }
            }
            System.out.println();
        }
    }
    
}
