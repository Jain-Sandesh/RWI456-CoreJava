package Exception;

public class ExceptionHandling1 {
    
    public static void main(String[] args) {
        
        int i=0;
        int j=0;

        int a[]=new int[5];

        String s = null;

        try
        {
            System.out.println(a[1]); //0
            j=18/i;                   // if no exception is present in the above line then go to catch block of ArithmeticException print the msg and then rest of the code.
            System.out.println(s.length()); // if no exception is present in the above line go to catch block of Exception print the msg and then rest of the code.
            System.out.println(a[5]); // if no exception is present in the above line then go to catch block of ArrayIndexOutOfBoundsException print the msg and then rest of the code.    
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by zero." );
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exceed array limit.");
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong...");
        }

        System.out.println(j);

        System.out.println("End the program");
    }
}
