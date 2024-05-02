package Multithreading;

public class GroupThreadConstructor implements  Runnable {


    @Override
    public void run() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'run'");

        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {

        GroupThreadConstructor gtc=new GroupThreadConstructor();
        
        ThreadGroup tg1=new ThreadGroup( "Parent Thread");

        Thread t1=new Thread(tg1, gtc , "start");
        t1.start();

        Thread t2=new Thread(tg1, gtc, "the");
        t2.start();

        Thread t3=new Thread(tg1, gtc, "work");
        t3.start();

        System.out.println("Thread Group Name : " + tg1.getName());
        tg1.list();
        
    }
    
}
