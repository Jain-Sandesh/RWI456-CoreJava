/* Making Heart Shape

 *      + +   + + 
        +   +   + 
          +   +   
            +   
 */

package Patterns;

public class Pattern21 extends Thread{

    public static void main(String[] args) {
        
        
        for(int i=1; i<=4; i++)
        {
            for(int j=1; j<=5; j++)
            {
                if((i==4 && j==3) || (i==1 && (j<=2 || j>=4)) || (i==3 && (j==2 || j==4)) || (i==2 && (j==1 || j==3 || j==5)))
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
