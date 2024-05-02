package Multithreading;

public class GroupThreadConstructor2 extends Thread {


    @Override
    public void run() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'run'");
        try{
            Thread.sleep(2000);
        
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().isAlive());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
       // System.out.println(Thread.currentThread().isAlive());
    }

    public static void main(String[] args) {

        GroupThreadConstructor2 gtc=new GroupThreadConstructor2();
        System.out.println("The thread is start or not : " + gtc.isAlive());
        gtc.start();
        System.out.println("After starting the thread : " + gtc.isAlive());

        
    }
    
}
