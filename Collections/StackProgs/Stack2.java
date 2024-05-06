// Here we implement Stack in the form of ArrayList.

package Collections.StackProgs;

import java.util.ArrayList;

class Stack
{
    static ArrayList<Integer> list = new ArrayList<>();

    public static boolean isEmpty()
    {
        return list.size() == 0;
    }

    //push fxn
    public static void push(int data)
    {
        list.add(data);
    }


    //pop
    public static int pop() // for pop() we have to find out the last element of the array list
    {
        //corener case that is if list is empty
        if(isEmpty())
        {
            return -1;
        }

        // if list is not empty
        int top = list.get(list.size()-1); // here find the last element of the list and assing it as 'top' of the Stack.
        list.remove(list.get(list.size()-1)); // here we remove or delete the last element of the list.
        return top;

    }


    //return peek
    public static int peek()
    {
        if(isEmpty())
        {
            return -1;
        }

        return list.get(list.size()-1); //here we return the last element of the list.

    }
}

public class Stack2 {

    public static void main(String[] args) {
        
        Stack s = new Stack();

        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        s.push(0);

        while(!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }
    
}
