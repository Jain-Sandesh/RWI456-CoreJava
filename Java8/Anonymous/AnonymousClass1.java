package Java8.Anonymous;

class A
{
    public void show()
    {
        System.out.println("Show in A.");
    }
}

public class AnonymousClass1 {

    public static void main(String[] args) {

        // We can create multiple anonymous class.

        //this is first anonymous class
        A a1 = new A()
        {
            public void show()
            {
                System.out.println("Show in new1.");
            }
        };
        a1.show();


        //this is second anonymous class
        A a2 = new A()
        {
            public void show()
            {
                System.out.println("Show in new2.");
            }
        };
        a2.show();
    }
    
}
