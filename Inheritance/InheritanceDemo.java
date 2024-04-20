// Hierarchical Inheritance Example


class Appliances
{
    void runBy()
    {
        System.out.println("Run by electricity....");
    }
}

class MixerGrinder extends Appliances
{
    void use()
    {
        System.out.println("Use for grinding spices, making chutney etc....");
    }
}

class Refrigerator extends Appliances
{
    void use()
    {
        System.out.println("Use for cooling and storing food items etc....");
    }
}


public class InheritanceDemo
{
    public static void main(String args[])
    {
        MixerGrinder mg=new MixerGrinder();
        mg.runBy();
        mg.use();

        System.out.println();

        Refrigerator r=new Refrigerator();
        r.runBy();
        r.use();
    }
}