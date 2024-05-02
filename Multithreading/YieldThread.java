/* */

package Multithreading;

public class YieldThread extends Thread {

    public void run()
    {
        for(int i=0; i<2; i++)
        {
            System.out.println(Thread.currentThread().getName() + " My Thread");
        }
    }

    public static void main(String[] args) {

        YieldThread yt1=new YieldThread();
        yt1.start();

        YieldThread yt2=new YieldThread();
        yt2.start();

        for(int i=0; i<2; i++)
        {
            yt1.yield();
            System.out.println(Thread.currentThread().getName() + " My Thread1");
        }
        
    }
    
}
