// Make a list and add the following elements to it - {1,5,7,3,8,2,4}. Search for the number 7 and display its index number.

package Collections.LinkedLists;
import java.util.*;

public class LinkedLists2 {

    public static void main(String[] args) {
        
        LinkedList<Integer> lnum = new LinkedList<>();

        lnum.addFirst(1);
        lnum.addLast(5);
        lnum.addLast(7);
        lnum.addLast(3);
        lnum.addLast(8);
        lnum.addLast(2);
        lnum.addLast(4);

        int find = 7;
        
        for(int i=0; i<lnum.size(); i++)
        {
            if(lnum.get(i) == find)
            {
                System.out.println("The number 7 is found at index -> " + i);
                return;
            }
            
        }
    }
    
}
