/*
 * Print "I Heart U" in star form
 */

package Patterns;

public class Pattern22 extends Thread{

    public static void main(String[] args) {
        
        //Print I
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=5; j++)
            {
                if(i==1 || i==5 || j==3)
                {
                    try
                    {
                        Thread.sleep(800);
                        System.out.print("* ");
                    }
                    catch(Exception e)
                    {
                        System.out.println("The Exception is " + e);
                    }
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();


        //Print Heart
        for(int i=1; i<=4; i++)
        {
            for(int j=1; j<=5; j++)
            {
                if((i==4 && j==3) || (i==1 && (j<=2 || j>=4)) || (i==3 && (j==2 || j==4)) || (i==2 && (j==1 || j==3 || j==5)))
                {  
                    try
                    {
                        Thread.sleep(800);
                        System.out.print("* ");
                    }
                    catch(Exception e)
                    {
                        System.out.println("The Exception is " + e);
                    }
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        //System.out.println();

        //Print U
        for(int i=1; i<=4; i++)
        {
            for(int j=1; j<=6; j++)
            {
                if((j==1 && i<=2) || (j==6 && i<=2) || (i==4 && (j==3 || j==4)) || (i==3 && (j==2 || j==5)))
                {
                    try
                    {
                        Thread.sleep(800);
                        System.out.print("* ");
                    }
                    catch(Exception e)
                    {
                        System.out.println("The Exception is " + e);
                    }
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
