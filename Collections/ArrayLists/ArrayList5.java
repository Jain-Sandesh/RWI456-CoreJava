// Print the given ArrayList and it's size.
//Q1. Delete the element present at the specific index number of the given ArrayList and print the list and it's size.

package Collections.ArrayLists;
import java.util.ArrayList;

public class ArrayList5 {

    public static void main(String[] args) {
        
        ArrayList<Integer> num = new ArrayList<>();

        num.add(2);
        num.add(4);
        num.add(6);
        num.add(10);
        num.add(12);

        //display elements with the existing list
        System.out.print("List with existing elements : ");
        System.out.println(num);
        int size = num.size(); //size() returns the length or size of the given ArrayList.
        System.out.println("Size of the given array list is : " + size);

        System.out.println();

        // delete the element present at the index 2 of the given list
        num.remove(2);
        System.out.print("List after delete an element : ");
        System.out.println(num);
        int size1 = num.size(); //size() returns the length or size of the given ArrayList.
        System.out.println("Now the size of array list is : " + size1);

        // delete the element present at the index 3 of the given list
        // num.remove(3);
        // System.out.println(num);
    }
    
}
