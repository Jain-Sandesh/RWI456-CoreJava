//Imp Note - If you overload a static method in Java, it is the example of compile time polymorphism

/*Polymorphism in Java is a concept by which we can perform a single action in different ways. 
Polymorphism is derived from 2 Greek words: poly and morphs. The word "poly" means many and "morphs" means forms. So polymorphism means many forms.
There are two types of polymorphism in Java: compile-time polymorphism and runtime polymorphism */

// 1) Method Overloading: changing no. of arguments

/*class A
{
    int sum(int x, int y)
    {
        return(x + y);
    }
}

class B 
{
    int sum(int x, int y, int z)
    {
        return(x + y + z);
    }
}

public class CompiletimePolymorphism
{
    public static void main (String args[])
    {
        A a=new A();
        System.out.println("Sum of 7+8 is = " + a.sum(7, 8) + "."); // Sum of 7+8 is = 15

        B b=new B();
        System.out.println("Sum of 7+8+9 is = " + b.sum(7, 8, 9) + "."); // Sum of 7+8+9 is = 24
    }
} */


//2) Method Overloading: changing data type of arguments

class A
{
    int sum(int x, int y)
    {
        return(x + y);
    }
}

class B 
{
    double sum(double x, double y, double z)
    {
        return(x + y + z);
    }
}

public class CompiletimePolymorphism
{
    public static void main (String args[])
    {
        A a=new A();
        System.out.println("Sum of 7+8 is = " + a.sum(7, 8) + "."); // Sum of 7+8 is = 15

        B b=new B();
        System.out.println("Sum of 7.3+8.2+9.5 is = " + b.sum(7.3, 8.2, 9.5) + "."); // Sum of 7.3+8.2+9.5 is = 25.0
    }
}

// Imp Note - In java, method overloading is not possible by changing the return type of the method only because of ambiguity.