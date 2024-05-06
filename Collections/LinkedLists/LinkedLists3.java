// Take elements (number in the rnge of 1-50) of a linke lists as input from the user.
// Delete all nodes which have values greater than 25.

package Collections.LinkedLists;
import java.util.*;


public class LinkedLists3 {

    public static void main(String[] args) {
        
        LinkedList<Integer> lnum = new LinkedList<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int element = sc.nextInt();

        //inserting the elements
        for(int i=0; i<element; i++)
        {
            lnum.add(i, sc.nextInt());
        }

        System.out.println();

        //display
        for(int i=0; i<element; i++)
        {
            System.out.print(lnum.get(i) + " -> ");
        }
        System.out.print("NULL");


        // deleteing the element greater than 25
    }
    
}
