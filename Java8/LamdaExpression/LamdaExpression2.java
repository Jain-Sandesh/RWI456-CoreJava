package Java8.LamdaExpressions;


@FunctionalInterface
interface Mul 
{
    void show(int i,int j);
    
}

public class LamdaExpression2 {
    
    public static void main(String[] args) {

          
        Mul m = (i, j) -> 
            {
                int x = i*j;
                System.out.println(x);
            };

        m.show(5, 6);
    }
}
