// Implementation of Circular Queue using Array.
// Here for add, peek and remove an element in a Queue using array time complexity is O(1), O(1) and O(1) respectively. 
// Here for incrementation of 'rear' we don't do 'rear++'. Instead of this we do 'rear = (rear+1)%size'.
// Here for checking Queue is full, we use condition like '(rear+1)%size == front'

package Collections.Queues;

public class Queue2 {

    static class CircularQueue
    {
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;

        CircularQueue(int size)
        {
            this.size = size;
            arr = new int[size];
        }

        //if Queue is empty
        public static boolean isEmpty()
        {
            return rear == -1 && front == -1;
        }

        //if Queue is Full
        public static boolean isFull()
        {
            return (rear+1)%size == front;
        }

        //insertion of elements
        public static void add(int data)
        {
            if(isFull())
            {
                System.out.println("Queue is full.");
                return;
            }

            //for adding first element
            if(front == -1)
            {
                front = 0;
            }

            // if queue is not full
            rear = (rear+1)%size; //increment of rear
            arr[rear] = data;

        }

        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("Queue is empty.");
                return -1;
            }

            //if not empty
            int temp = arr[front];

            //if only one element is present
            if(rear == front)
            {
                rear = front = -1;
            }
            else
            {
                front = (front+1)%size; //increment of front
            }

            return temp;
        }

        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("Queue is empty.");
                return -1;
            }

            return arr[front];
        }
    }



    public static void main(String[] args) {

        CircularQueue cq = new CircularQueue(5);

        cq.add(1);
        cq.add(2);
        cq.add(3);
        cq.add(4);
        cq.add(5);

        System.out.println(cq.remove());
        cq.add(6);

        System.out.println(cq.remove());
        cq.add(7);

        while(!cq.isEmpty())
        {
            System.out.print(cq.peek() + " | ");
            cq.remove();
        }
        
    }
    
}
