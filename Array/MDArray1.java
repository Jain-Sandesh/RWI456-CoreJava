/*
 * Input and Print 3x3 matrix
 *      1 2 3
 *      4 5 6
 *      7 8 9 
 */

package Array;

import java.util.Scanner;

class InnerMDArray1
{
    public void inputArray(int row, int col, int arr[][])
    {
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                Scanner sc=new Scanner(System.in);
                arr[i][j] = sc.nextInt();  // one by one values are stored in i^th row of j^th column
            }
        }
    }

    public void outputArray(int row, int col, int arr[][])
    {
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class MDArray1 {

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
    }
    
}
