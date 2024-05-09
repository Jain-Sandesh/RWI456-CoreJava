//Q. Max till 'i'.
// That means, given an array if size 'n'. For every 'i'(iteration) from '0' to 'n-1' print max(a[0], a[1],....a[n])
// Example -> Let's an array of size '6' and elements are [1,0,5,4,6,8]
// Output -> 1 1 5 5 6 8 (Max till 'i')

package Array;
import java.util.Scanner;

class InnerArrayQ5
{
    public void inputElements(int size, int arr[])
    {
        System.out.println("Enter the elements :- ");
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<size; i++)
        {
            arr[i] = sc.nextInt();
        }
    }

    public void innerMethod(int size, int arr[])
    {
        int mx = Integer.MIN_VALUE;
        
        System.out.print("Max till size of the array -> { ");
        for(int i=0; i<size; i++)
        {
            mx = Integer.max(mx, arr[i]);
            System.out.print(mx + ", ");
        }
        System.out.print("}.");

    }

    public void displayArray(int size, int arr[])
    {
        System.out.println();
        System.out.print("{ ");
        for(int i=0; i<size; i++)
        {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("}.");
    }
}
public class ArrayQ5 {

    public static void main(String[] args) {
        
        InnerArrayQ5 obj = new InnerArrayQ5();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt(); 

        int arr[] = new int[size];

        obj.inputElements(size, arr);
        obj.innerMethod(size, arr);
        //obj.displayArray(size, arr);
    }
    
}
