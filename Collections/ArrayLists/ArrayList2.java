// Create an ArrayList of Integer type and add some elements and display the elements present at index 1;

package Collections.ArrayLists;

import java.util.ArrayList;

public class ArrayList2 {

    public static void main(String[] args) {
        
        ArrayList<Integer> num = new ArrayList<>();

        //add elements 
        num.add(0);
        num.add(5);
        num.add(10);

        //get elements
        int element = num.get(1);
        System.out.println(element); //5
    }
    
}
