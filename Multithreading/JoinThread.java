/*
 * The join() method in Java is provided by the java.lang.Thread class that permits one thread to wait until 
 * the other thread to finish its execution. Suppose "th" be the object the class Thread whose thread 
 * is doing its execution currently, then the th.join(); statement ensures that "th" is finished before
 * the program does the execution of the next statement.
 * When there are more than one thread invoking the join() method, then it leads to overloading on the join() method
 * that permits the developer or programmer to mention the waiting period. 
 * However, similar to the sleep() method in Java, the join() method is also dependent on the operating system for the timing,
 * so we should not assume that the join() method waits equal to the time we mention in the parameters. 
 * The following are the three overloaded join() methods.

Description of The Overloaded join() Method:-
join(): When the join() method is invoked, the current thread stops its execution and the thread 
        goes into the wait state. The current thread remains in the wait state until the thread 
        on which the join() method is invoked has achieved its dead state. If interruption of the thread occurs,
        then it throws the InterruptedException.
 */

package Multithreading;

public class JoinThread extends Thread {

    public void run()
    {
        for(int i=0; i<2; i++)
        {
            try
            {
                Thread.sleep(1000);
                System.out.println("The Current Thread name is " + Thread.currentThread().getName());
            }
            catch(Exception e)
            {
                System.out.println("The exception is " + e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        // creating thread1
        JoinThread jt1=new JoinThread();
        // start the thread jt1
        jt1.start();

        try{
            System.out.println("The Current Thread name is " + Thread.currentThread().getName());
            // invoking the join method
            jt1.join();
        }
        catch(Exception e)
        {
            System.out.println("The exception is " + e);
        }

        // creating thread2
        JoinThread jt2=new JoinThread();
        // start the Thread jt2
        jt2.start();

        // starting the second thread after when  
        // the first thread th1 has ended or died.
        try{
            System.out.println("The Current Thread name is " + Thread.currentThread().getName());
            // invoking the join method
            jt2.join();
        }
        catch(Exception e)
        {
            System.out.println("The exception is " + e);
        }

        // creating thread3
        JoinThread jt3=new JoinThread();
        // start the Thread jt3
        jt3.start();

        // starting the third thread after when  
        // the second thread th1 has ended or died.
        try{
            System.out.println("The Current Thread name is " + Thread.currentThread().getName());
            // invoking the join method
            jt3.join();
        }
        catch(Exception e)
        {
            System.out.println("The exception is " + e);
        }   
    }    
}
