/* Implementation of Stack using Collection framework */

package Collections.StackProgs;
import java.util.Stack;

public class Stack3 {

    public static void main(String[] args) {
        
        Stack<Integer> s = new Stack<>();

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
