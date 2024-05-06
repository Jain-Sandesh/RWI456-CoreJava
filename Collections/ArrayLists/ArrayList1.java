/*
 * (a) Insert is O(n) { Time Complexity for insertion operation in array list }.
 * (b) Search is O(1) { Time Complexity for searching operation in array list }.
 */

// Create an ArrayList of Integer type and add some elements to it and display those elements;

package Collections.ArrayLists;

import java.util.ArrayList;

public class ArrayList1 {

    public static void main(String[] args) {
        
        ArrayList<Integer> num = new ArrayList<>(); // one way of declaration
        //ArrayList<Integer> num new ArrayList<Integer>(); // second way of declaration

        //add elements

        num.add(0);
        num.add(5);
        num.add(10);

        System.out.println(num);

    }
    
}
