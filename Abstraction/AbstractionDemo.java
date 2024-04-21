abstract class Bank
{
    Bank()
    {
        System.out.println("Bank is created");
    }

    abstract int getRateOfInterest();
}

class HDFC extends Bank
{
    int getRateOfInterest()
    {
        return 7;
    }
}

class IDFC extends Bank
{
    int getRateOfInterest()
    {
        return 8;
    }
}

public class AbstractionDemo
{
    public static void main(String args[])
    {
        // Firt way to call the methods

        HDFC h=new HDFC();
        System.out.println("Rate of Interest in HDFC is - " + h.getRateOfInterest() + " %");

        IDFC i=new IDFC();
        System.out.println("Rate of Interest in IDFC is - " + i.getRateOfInterest() + " %"); 

        // Second way to call the methods
       /* Bank b;

        b=new HDFC();
        System.out.println("Rate of Interest in HDFC is - " + b.getRateOfInterest() + " %");

        b=new IDFC();
        System.out.println("Rate of Interest in IDFC is - " + b.getRateOfInterest() + " %"); */
    }
}
