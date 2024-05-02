package Multithreading;

public class GetNameAndSetNameThread extends Thread {

    public void run()
        {
            System.out.println(Thread.currentThread().getName());   
            System.out.println("Thread Task1");
        }

        public void runs()
        {
            System.out.println(Thread.currentThread().getName());
        }

    public static void main(String[] args) {

        GetNameAndSetNameThread gsnt = new GetNameAndSetNameThread();
        gsnt.start(); //1. Thread 0 
        // 2. Thread Task1
        
        gsnt.runs(); //main
        System.out.println(Thread.currentThread().getName()); //main
        
    }
    
}
