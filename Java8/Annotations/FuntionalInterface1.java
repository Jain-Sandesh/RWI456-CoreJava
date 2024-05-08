//not working

package Java8.Annotations;

/**
 * @
 * InnerFuntionalInterface
 */
// funtional interfaces are those interfaces which only have one undefined method
@FunctionalInterface
interface DemoFI 
{
    void show();
    
}

public class FuntionalInterface1 {

    public static void main(String[] args) {

        DemoFI dfi = new DemoFI() 
        {            
            public void show()
            {
                System.out.println("Show in functional Interface");
            }
        };
        dfi.show();
        
    }
    
}
