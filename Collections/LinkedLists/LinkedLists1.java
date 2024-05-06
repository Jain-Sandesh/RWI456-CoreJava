package Collections.LinkedLists;
import java.util.*;

public class LinkedLists1 {

    public static void main(String[] args) {

        LinkedList<String> lists1 = new LinkedList<>();

        lists1.addFirst("to");
        lists1.addFirst("Welcome");
        System.out.println(lists1);
        System.out.println(lists1.size());

        lists1.addFirst("Hello and");
        lists1.addLast("Railworld");
        lists1.addLast("India"); // by default add funtion add elements at the last position

        // one way of printing the list
        // System.out.println(lists1); 


        // // second way of printing the list
        // Iterator String = lists1.iterator();
        // while(String.hasNext())
        // {
        //     System.out.println(String.next());
        // }


        // third way of printing the list
        for(int i=0; i<lists1.size(); i++)
        {
            System.out.print(lists1.get(i) + " -> ");
        }
        System.out.print("NULL");

        System.out.println();
        System.out.println(lists1.size());
        
        
        lists1.removeFirst();
        System.out.println(lists1);

        lists1.removeLast();
        System.out.println();

    }
    
}
