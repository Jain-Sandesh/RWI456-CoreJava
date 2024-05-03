// Create an ArrayList of Integer type and add some elements to it and display those elements;

package Collections;
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
