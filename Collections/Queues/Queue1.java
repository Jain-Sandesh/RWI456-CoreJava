// Queue is an important data structure work on FIFO basis "First In First Out"


// Implementation of Queue using Array. 
// Here for add, peek and remove an element in a Queue using array time complexity is O(1), O(n) and O(n) respectively. 

package Collections.Queues;

public class Queue1 {

    static class Queue
    {
        static int arr[];
        static int size;
        static int rear = -1;

        Queue(int size)
        {
            arr = new int[size];
            this.size = size;
        }

        //if Queue is empty
        public static boolean isEmpty()
        {
            return rear == -1;
        }

        //enqueue (insertion in Queue)
        public static void add(int data)
        {
            //if Queue is full
            if(rear == size-1)
            {
                System.out.println("Queue is full");
                return;
            }

            rear++;
            arr[rear] = data;
        }


        //dequeue (deletion operation)
        public static int remove()
        {
            //corener case
            if(isEmpty())
            {
                System.out.println("Nothing is present for deletion");
                return -1;
            }

            int front = arr[0]; // here 'front', i.e., first element is delete
            // now we have to shift all the elements to its previous place beacuse deletion is happens only from 'front'
            for(int i=0; i<rear; i++)
            {
                arr[i] = arr[i+1];
            }
            rear--; // we shifted all elements to previou place so now our rear should also shift to its previous place,
            return front;
        }


        //peek
        public static int peek()
        {
            //corener case
            if(isEmpty())
            {
                System.out.println("Queue is empty");
                return -1;
            }

            return arr[0]; 
        }
    }    

    public static void main(String[] args) {
        
        Queue q = new Queue(5);

        q.add(1);
        q.add(3);
        q.add(5);
        q.add(7);
        q.add(9);

        q.remove();

        q.add(11);

        q.remove();

        q.add(13);

        //printing the elements
        while(!q.isEmpty())
        {
            System.out.print(q.peek() + " | ");
            q.remove();
        }
    }
}
