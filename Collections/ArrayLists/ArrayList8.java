package Collections.ArrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int size = sc.nextInt();
        
        ArrayList<Integer> a1 = new ArrayList<>();

        System.out.println("Enter the elements of Array List :-");
        for(int i=0; i<size; i++)
        {
            a1.add(i, sc.nextInt());
        }

        System.out.println();

        Collections.sort(a1); //for sorting the input ArrayList in ascending order. 

        //display elements of ArrayList using for loop
        System.out.println("Elements of the ArrayList is :-");
        System.out.print("{ ");
        for(int i=0; i<a1.size(); i++)
        {
            System.out.print(a1.get(i) + ", ");
        }
        System.out.println("}");
    }
    
}
