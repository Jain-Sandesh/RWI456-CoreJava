// here we achieve multiple inheritance by using interface

interface Vehicle
{
    void start();
}

interface Automobile extends Vehicle
{
    void drive();
}

class Bike implements Vehicle, Automobile
{
   public void start()
    {
        System.out.print("Start your bike when signal is green");
    }
   public void drive()
    {
        System.out.println(" and drive slowly.");
    }
}

public class InterfaceDemo
{
    public static void main(String args[])
    {
        Bike b=new Bike();
        b.start();
        b.drive();
    }
}
