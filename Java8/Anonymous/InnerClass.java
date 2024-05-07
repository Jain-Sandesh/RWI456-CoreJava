// Class inside a class is known as inner class
// We cannot create a object of inner class directly by saying "InnerClass obj = new InnerClass();", this will give error
// If we declared inner class as 'static' then we create its object,
//  otherwise we have to refer object for creating inner class object

// We never declared outer class as 'static class'

package Java8.Anonymous;

class A
{
    int age;

    public void show()
    {
        System.out.println("Age must be greater than or equal to 18 for voting");
    }

    class B
    {
        public void inB()
        {
            System.out.println("Inside the class B");
        }
    }

}

public class InnerClass {

    public static void main(String[] args) {
        
        A a = new A();
        a.show();

        //B b = new B(); // here we got an error called "B cannot be resolved to a type".

        // if not declared our inner class as static then this is the method for creating the object of inner class
        A.B b = a.new B(); 
        b.inB();

        // if we declared our inner class as static then this is the way to create object of inner class
        // B b = new B();
        // b.inB();

    }
    
}
