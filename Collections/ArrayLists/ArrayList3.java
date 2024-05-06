// Create an ArrayList of Integer type and add some elements and display them after that add an element in between of that List
// and after that print that new list.

package Collections.ArrayLists;

import java.util.ArrayList;

public class ArrayList3 {

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

        // add element in b/w of the list
        num.add(3, 8); // add element '8' at index number '3'.

        //display elements after adding element in between of the list
        System.out.print("List After adding element in between of the list : ");
        System.out.println(num);
    }
    
}
