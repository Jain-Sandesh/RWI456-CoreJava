// Loops in ArrayList

package Collections;

import java.util.ArrayList;

public class ArrayList6 {

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

        //for loop use to iterate over the given ArrayList
        System.out.print("{ ");
        for(int i=0; i<num.size(); i++)
        {
            System.out.print(num.get(i) + ", ");
        }
        System.out.println("}");
    }
    
}
