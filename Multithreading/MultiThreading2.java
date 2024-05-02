package Multithreading;

class MyThread1 extends Thread
{
    public void start()
    {
        System.out.println("Thread1 is starting...");
    }

    public void run()
    {
        System.out.println("Thread1 is running...");
    }
}

class MyThread2 extends Thread
{
    public void start()
    {
        System.out.println("Thread2 is starting...");
    }

    public void run()
    {
        System.out.println("Thread2 is running...");
    }
}

public class MultiThreading2 {

    public static void main(String[] args) {
        MyThread1 mt1 = new MyThread1();
        mt1.start(); // Thread1 is starting...
        mt1.run(); // Thread1 is running...

        System.out.println();
        
        MyThread2 mt2 = new MyThread2();
        mt2.start(); //Thread2 is starting...
        mt2.run(); // Thread2 is running...
        
    }
    
}
