/* Linked List :-
 * (a) It is of variable size.
 * (b) Non-contiguous memorey allocation.
 * (c) Insert is O(1) { Time Complexity for insertion operation in linked list }.
 * (d) Search is O(n) { Time Complexity for searching operation in linked list }.
 * (e) Linked List is formed by "nodes".
 * (f) Node of a linked list ia made up of two part i.e., first part is 'data' and 
 * second part is 'next' or address (which acts as a reference and use to refer towards the next node of the linked list).
 * (g) Last node of every linked list contains 'null', and also known as 'Tail Node' 'NULL Node'.
 * (h) First node of every linked list is known as 'Head Node' of that linked list.
 * (i) There are three types of linked list present here - 
 * (1) Singular Linked List or Single Ended Linked List.
 * (2) Doubly Linked List or Double Ended Linked List.
 * (3) Circular Linked List.
 */

 // create a linked list of String type in which we add elements at starting point as well as at ending point and 
// also we display the list.

package Collections.LinkedLists;


public class LinkedList1 {

    private int size;

    LinkedList1()
    {
        this.size=0;

    }

    Node head;
    public class Node
    {
        String data;
        Node next;

        Node(String data)
        {
            this.data = data;
            this.next = null;
            size++;
        }
    }

        // for adding the elements in start position
        public void addFirst(String data)
        {
            Node newNode = new Node(data);

            // if no list is found, then head becomes the new node of the list.
            if(head == null)
            {
                head = newNode;
                return;
            }

            // if list is exist
            newNode.next = head;
            head = newNode;

        }

        // for adding the elements in last position
        public void addLast(String data)
        {
            Node newNode = new Node(data);

            // if no list is found, then head becomes the new node of the list.
            if(head == null)
            {
                head = newNode;
                return;
            }

            // if list is exist
            Node currNode = head; //for traversing in a linked list
            while (currNode.next != null) {
                currNode = currNode.next; //increment from current node to next node and next node become current node.
            
            }

            currNode.next = newNode; // when we reach to last node, then the 'next' of current node points towards the new node. 


        }

        //for displaying the list
        public void printList()
        {
            if(head == null)
            {
                System.out.println("List is Empty");
                return;
            }

            Node currNode = head;
            while(currNode != null)
            {
                System.out.print(currNode.data + " -> ");
                currNode = currNode.next;
            }

            System.out.println("Null");

    }


    // for delete an element from the starting point
    public void deleteFirst()
    {
        //corner case
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }
        
        size--;
        head = head.next;
    }


    // for delete an element from the ending point
    public void deleteLast()
    {
        //corner case
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }

        size--;
        //if only one element is present in the list
        if(head.next == null)
        {
            head = null;
            return;
        }

        //more that one element is present in the list
        Node sLast = head;
        Node lNode = head.next;

        while(lNode.next != null)
        {
            lNode = lNode.next;
            sLast = sLast.next;
        }

        sLast.next = null;

    }

    public int getSize()
    {
        return size;
    }


    // adding element in between of a list
    public void addInMiddle(int index, String data)
    {
        //corner case
        if(index > size || index < 0)
        {
            System.out.println("Invalid Index Value");
            return;
        }


        Node newNode = new Node(data);

        //if only one element is present
        if(head == null || index == 0)
        {
            newNode.next = head;
            head = newNode;

            return;
        }

        Node curNode = head;
        for(int i=1; i<size; i++)
        {
            if(i == index)
            {
                Node temp = curNode.next;
                curNode.next = newNode;
                newNode.next = temp;
            }
            curNode = curNode.next; // not understand this line
        }
    }



    public static void main(String[] args) {

        LinkedList1 list1 = new LinkedList1();
        list1.addFirst("to");
        list1.addFirst("Welcome");  
        //list1.printList();

        list1.addLast("RailWorld");
        list1.addLast("Pvt. Ltd.");
        list1.printList();
        System.out.println(list1.getSize());

        // list1.deleteFirst();
        // list1.printList();
        // System.out.println(list1.getSize());

        // list1.deleteLast();
        // list1.printList();
        // System.out.println(list1.getSize());

        list1.addInMiddle(3, "India");
        list1.printList();
        System.out.println(list1.getSize());
        
    }

}
