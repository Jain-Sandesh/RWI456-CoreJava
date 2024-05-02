/*
 * Print the principle elements of 2D array
 *      1
 *          5
 *              9
 */

package Array;

import java.util.Scanner;

class InnerMDArray2
{
    void showPrincipleLine(int row, int col, int arr[][])
    {
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                if(i==j)
                {
                    System.out.print(arr[i][j] + " ");
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

public class MDArray2 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number of rows : ");
        int row = sc.nextInt(); // input the number of rows that user want.
        
        System.out.print("Enter the number of columns : ");
        int col = sc.nextInt(); // input the number of columns that user want.

        int arr[][] = new int[row][col]; // declaring and initialising the array

        System.out.println();

        InnerMDArray1 obj=new InnerMDArray1(); // initialising the InnerMDArray class from where we use inputArray and outputArray funtions.

        //input the array elements
        System.out.println("Enter the number of elements in array :-");
        obj.inputArray(row, col, arr);

        System.out.println();

        //output the array elements
        System.out.println("The array entered by you is :-");
        obj.outputArray(row, col, arr);

        //output the principle elements only
        InnerMDArray2 imd2=new InnerMDArray2();
        System.out.println("The principle elements of array is :-");
        imd2.showPrincipleLine(row, col, arr);
    }
    
}
