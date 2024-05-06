// Q. Push element at the bottom of the Stack

package Collections.StackProgs;
import java.util.Stack;;

public class Stack4 {

    public static void pushAtBottom(int data, Stack<Integer> s)
    {
        // corner case
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }

        // here we use recursion
        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);

    }

    public static void main(String[] args) {
        
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
       
        pushAtBottom(4, s);
        pushAtBottom(5, s);
        pushAtBottom(6, s);

        while (!s.isEmpty()) 
        {
            System.out.println(s.peek());
            s.pop();
            
        }
    }
    
}
