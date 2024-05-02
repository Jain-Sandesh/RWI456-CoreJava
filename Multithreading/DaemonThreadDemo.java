package Multithreading;

public class DaemonThreadDemo extends Thread {

    public void run()
    {
        System.out.println("This is child thread");
    }

    public static void main(String[] args) {

        System.out.println("Parent Thread");
        DaemonThreadDemo dtd=new DaemonThreadDemo();
        dtd.setDaemon(true);
        dtd.start();
        
    }
    
}
