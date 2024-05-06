//Q1. Removing or Deleting and element from the existing linked list.
//Q2. Finding the size of the linked list.

package Collections.LinkedLists;

public class LinkedList3 {

    private int size;

    LinkedList3()
    {
        this.size = 0;
    }

    Node head;
    public class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
            size++;
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


    // for delete the element fron starting position
    public void deleteStart()
    {
        //corner case
        if(head == null)
        {
            System.out.println("The list is empty");
            return;
        }

        size--;
        // now the second element become the head of the list 
        //that means the first element is deleted and now the second element become first element
        head = head.next; 
    }


    // for delete the element fron ending position
    public void deleteEnd()
    {
        //corner case
        if(head == null)
        {
            System.out.println("The list is empty");
            return;
        }

        size--;

        // when only single element is present in the given linked list
        if(head.next == null)
        {
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null)
        {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    public int getSize()
    {
        return size;
    }


    //for adding element in the middle of linked list
    public void addInBetween(int index, int data)
    {
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

        //if more than one element is present
        Node cuNode = head;
        for(int i=1; i<size; i++)
        {
            if(i == index)
            {
                Node temp = cuNode.next;
                cuNode.next = newNode;
                newNode.next = temp;

                break;
            }
            cuNode = cuNode.next; // not understand this line
        }
    }


    public static void main(String[] args) {
        LinkedList3 list3 = new LinkedList3();

        list3.addStart(32);
        //list3.displayList();

        list3.addStart(31);
        //list3.displayList();

        list3.addEnd(33);
        //list3.displayList();

        list3.addEnd(36);
        list3.displayList();

        System.out.println(list3.getSize());

        // list3.deleteEnd();
        // list3.deleteStart();
        // list3.displayList();

        // System.out.println(list3.getSize());

        list3.addInBetween(3, 34);
        list3.displayList();
        System.out.println(list3.getSize());

        list3.addInBetween(4, 35);
        list3.displayList();
        System.out.println(list3.getSize());
    }
    
}
