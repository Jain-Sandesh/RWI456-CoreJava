// Set elemments in a given ArrayList.

package Collections.ArrayLists;

import java.util.ArrayList;

public class ArrayList4 {

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

        //set elements or modify or update elements in the given list

        num.set(3, 8); // set element '8' at index number '3'
        num.set(4, 10); // set element '10' at index number '4'

        System.out.print("List after set the elements of the list : ");
        System.out.println(num);
    }
    
}
