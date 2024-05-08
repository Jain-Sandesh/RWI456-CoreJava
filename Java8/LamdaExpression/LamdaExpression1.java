package Java8.LamdaExpressions;

/**
 * InnerLamdaExpression1
 */
@FunctionalInterface
interface A 
{
    void show();
    
}


public class LamdaExpression1 {

    public static void main(String[] args) {
        
        A a = () -> System.out.println("In new Show");

        a.show();
    }
    
}
