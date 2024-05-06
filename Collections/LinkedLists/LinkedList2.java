// create a linked list of integer type in which we add elements at starting point as well as at ending point and 
// also we display the list.

package Collections.LinkedLists;

public class LinkedList2 {

    Node head;
    public class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    // for adding the elements in the start position
    public void addStart(int data)
    {
        Node newN = new Node(data);
        if(head == null)
        {
            head = newN;
            return;
        }

        newN.next = head;
        head = newN;
    }


    // for adding the elements in the last position
    public void addEnd(int data)
    {
        Node newN = new Node(data);
        if(head == null)
        {
            head = newN;
            return;
        }

        Node n = head;
        while(n.next != null)
        {
            n = n.next;
        }
        n.next = newN;
        
    }


    // for displaying the list
    public void displayList()
    {
        if(head == null)
        {
            System.out.println("No list is found.");
            return;
        }

        Node n = head;
        while(n != null)
        {
            System.out.print(n.data + " -> ");
            n = n.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        
        LinkedList2 list2 = new LinkedList2();
        //list2.displayList();

        list2.addStart(32);
        list2.displayList();

        list2.addStart(31);
        list2.displayList();

        list2.addEnd(33);
        list2.displayList();

        list2.addEnd(34);
        list2.displayList();
    }
    
}
