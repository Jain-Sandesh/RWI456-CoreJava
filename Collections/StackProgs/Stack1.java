/*
 * (i) It used LIFO technique that is "Last In First Out".
 * (ii) There are majorly three operations which are performed on Stack in java.
 *      (a) Push O(1)
 *      (b) Pop O(1)
 *      (c) Peek O(1) {in C++ Peek is known as 'Top'}
 * (iii) There are three ways to implement Stack in code.
 *      (a) Array - it is of fixed size (it is hectic process because of its fixed size).
 *      (b) ArrayList - it is of variable size (here we treat 'nth' element as the 'Top' of Stack).
 *      (c) LikedList - it is of variable size (here we continuosly assign the 'Head' of linkedList to the new element and we treated 'Head' as the 'Top' of Stack).
 */


// Here in this program we implement Stack in the form of Linked List

package Collections.StackProgs;


public class Stack1 {

    static class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }

    }

    static class Stack
    {
        public static Node head;

        public static boolean isEmpty()
        {
            return head == null;
        }


        // for insertion of data to the Stack
        public static void push(int data)
        {
            Node newNode = new Node(data);
            
            //if no element is present in the Stack then the new inserted element become the 'head' of linked list 
            //or 'top' of the Stack.
            if(isEmpty())
            {
                head = newNode;
                return;
            }

            //if elements are already present in the Stack then the 'next' of new node refer towards the 'head' of linked list
            // and the new node now become the 'head' of the linked list or we can say 'top' of the Stack.
            // here we simply perform addFirst() operation of linked list. 
            newNode.next = head;
            head = newNode;

        }


        // for deletion of data from the Stack
        public static int pop() // pop() fx usually delete the element and also return the the deleted element in Java.
        {

            //corener case
            if(isEmpty())
            {
                return -1;
            }

            int top = head.data; // we asign 'top' of the stack to data in 'head' of the linked list.
            head = head.next; // here we change our 'head' of linked list with the second element of the list
            // now the second element become the 'head' of linked list or 'top' of the Stack.

            return top;
        }



        //for returning the 'top' of the Stack
        public static int peek()
        {
            // corener case that means if list is empty
            if(isEmpty())
            {
                return -1;
            }

            // if list is not empty
            return head.data;
        }

    }

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
