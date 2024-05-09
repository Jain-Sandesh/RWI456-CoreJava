/*
 * Print the number two in star form.
 */

package Patterns;

public class Pattern12 {

    public static void main(String[] args) {
        

        for(int i=1; i<=7; i++)
        {
            for(int j=1; j<=5; j++)
            {
                if(i==1 || i==4 || i==7 || (i<=4 && j==5) || (i>=4 && j==1))
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