package Collections.StackProgs;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
        
        Stack<Integer> snum = new Stack<>();

        snum.push(34);
        snum.push(2);
        snum.push(56);
        snum.push(2);
        snum.push(90);

        // one way of printing the output
        System.out.println(snum); 

        System.out.println();
        

        // second way of printing the output
        Iterator itr = snum.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
            
        }

        System.out.println();


        // third way of printing the output
        System.out.print("{ ");
        for(int i=0; i<snum.size(); i++)
        {
            System.out.print(snum.get(i) + ", ");
        }
        System.out.println("}");
    }

}
