package Java8.LamdaExpressions;

@FunctionalInterface
interface Implement
{
    void printEvenNum(int size);
}

public class LamdaExpression4 {

    public static void main(String[] args) {
        
        Implement im = (int size) ->
        {
            for(int i=0; i<size; i++)
            {
                if(i%2 == 0)
                {
                    System.out.println(i);
                }
                            
            }
        };

        im.printEvenNum(10);
    }
}
