package Multithreading;

class MyThread1 implements Runnable
{
    public void run()
    {
        System.out.println("Thread1 is starting...");
        System.out.println("Thread1 is running...");
    }

}

class MyThread2 implements Runnable
{
    public void run()
    {
        System.out.println("Thread2 is starting...");
        System.out.println("Thread2 is running...");
    }

}

public class MultiThreading1 {
    
    public static void main(String[] args) {

        MyThread1 mt1 = new MyThread1();
        MyThread2 mt2 = new MyThread2();
        Thread t1 = new Thread(mt1);
        Thread t2 = new Thread(mt2);
        t1.start(); 
        t2.start(); 
        
        System.out.println();
    }
}
