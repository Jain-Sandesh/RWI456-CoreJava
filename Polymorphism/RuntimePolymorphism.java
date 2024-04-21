/*Polymorphism in Java is a concept by which we can perform a single action in different ways. 
Polymorphism is derived from 2 Greek words: poly and morphs. The word "poly" means many and "morphs" means forms. So polymorphism means many forms.
There are two types of polymorphism in Java: compile-time polymorphism and runtime polymorphism 

Runtime Polymorphism in Java :-
Runtime polymorphism or Dynamic Method Dispatch is a process in which a call to an overridden method is resolved at runtime rather than compile-time.

In this process, an overridden method is called through the reference variable of a superclass. 
The determination of the method to be called is based on the object being referred to by the reference variable.

Let's first understand the upcasting before Runtime Polymorphism.

Upcasting :-

If the reference variable of Parent class refers to the object of Child class, it is known as upcasting. 
For example 1: 
class A{}  
class B extends A{}  
A a=new B();//upcasting  

For upcasting, we can use the reference variable of class type or an interface type. 
For Example 2:

interface I{}  
class A{}  
class B extends A implements I{}  
Here, the relationship of B class would be:

B IS-A A
B IS-A I
B IS-A Object
Since Object is the root class of all classes in Java, so we can write B IS-A Object.

*/

class HavellsDryIron
{
    int getWatt()
    {
        return (0);
    }
}

class InstaDryIron extends HavellsDryIron
{
    int getWatt()
    {
        return (600);
    }
}

class AquillaDryIron extends HavellsDryIron
{
    int getWatt()
    {
        return (1000);
    }
}

public class RuntimePolymorphism
{
    public static void main(String args[])
    {
        HavellsDryIron hdi;

        hdi=new InstaDryIron();
        System.out.println("Watt of Havells Insta Dry Iron is : " + hdi.getWatt() + "w."); // Watt of Havells Insta Dry Iron is : 600w.

        hdi=new AquillaDryIron();
        System.out.println("Watt of Havells Insta Dry Iron is : " + hdi.getWatt() + "w."); // Watt of Havells Insta Dry Iron is : 1000w.
    }
}
