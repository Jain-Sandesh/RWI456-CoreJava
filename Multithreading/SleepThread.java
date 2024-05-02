package Multithreading;

public class SleepThread extends Thread {

    public void run()
    {
        for(int i=0; i<=5; i++)
        {
            try
            {
                Thread.sleep(2000);
                
            }
            catch(Exception e)
            {
                e.printStackTrace();
                System.out.println(e);
            }

            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        SleepThread st1=new SleepThread();
        st1.start();

        SleepThread st2=new SleepThread();
        st2.start();
        
    }
    
}
