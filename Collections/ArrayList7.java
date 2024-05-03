// Sorting in ArrayList

package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList7 {

    public static void main(String[] args) {
        
        ArrayList<Integer> num = new ArrayList<>();

        num.add(12);
        num.add(18);
        num.add(6);
        num.add(2);
        num.add(0);

        //display elements with the existing list
        System.out.print("List with existing elements : ");
        System.out.println(num);

        //sorting in the given ArrayList
        Collections.sort(num);
        System.out.println(num);
    }
    
}
