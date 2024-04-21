abstract class Vehicle
{
    abstract void start();
    abstract void drive();
}

class Bike extends Vehicle
{
    void start()
    {
        System.out.print("Bike is started.");
    }
     void drive()
    {
        System.out.println(" Drive Safely");
    }
}

class Car extends Vehicle
{
    void start()
    {
        System.out.print("Car is started.");
    }
     void drive()
    {
        System.out.println(" Drive Safely");
    }
}

public class AbstractionDemo1
{
    public static void main(String args[])
    {
        Bike b=new Bike();
        b.start();
        b.drive();

        Car c=new Car();
        c.start();
        c.drive();
    }
}