package Java8.Anonymous;

abstract class NewAbstract
{
    public abstract void show();
    public abstract void config();
}


public class AnonymousClass2 {

    public static void main(String[] args) {
        
        //here we are not creating the object of 'abstract class A'. 
        //It is a new class which is anonymous whose object is created here.
        NewAbstract a1 = new NewAbstract() // here object of new inner class is created and the class is anonymous in nature.
        {
            public void show()
            {
                System.out.println("Show in new Show.");
            }

            public void config() {
                
                System.out.println("Show in new Config.");
            }

        };

        a1.show();
        a1.config();

    }
    
}
