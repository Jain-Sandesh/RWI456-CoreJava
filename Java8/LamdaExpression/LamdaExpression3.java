package Java8.LamdaExpressions;


@FunctionalInterface
interface Implementation
{
    void evenNum(int i);
}

public class LamdaExpression3 {

    public static void main(String[] args) {
        
        Implementation im = (int i) ->
            {
                if(i % 2 == 0)
                {
                    System.out.println("Even number");
                }
                else
                {
                    System.out.println("Not even number");
                }
            };
        im.evenNum(6);
    }

}
    

