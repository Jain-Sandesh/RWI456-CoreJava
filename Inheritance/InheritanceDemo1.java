//Multilevel Inheritance Example

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
        System.out.println("Use for grinding spices, making chutney.");
    }
}

class JuicerMixerGrinder extends MixerGrinder
{
    void extraUse()
    {
        System.out.println("It is also use for extract jiuce from fruits etc....");
    }
}

public class InheritanceDemo1
{
    public static void main(String args[])
    {
        JuicerMixerGrinder jmg=new JuicerMixerGrinder();
        jmg.runBy();
        jmg.use();
        jmg.extraUse();
    }
}