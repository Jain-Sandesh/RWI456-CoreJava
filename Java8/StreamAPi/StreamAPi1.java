package Java8.StreamAPi;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class StreamApi1 {

    public static void main(String[] args) {
        
        //this list is immutable in nature.
        List<String> list1 = List.of("Chichi", "Shichi", "Homus", "Shitmanglu", "Chitmangli");
        System.out.println(list1);

        List<String> names = list1.stream().filter(e->e.startsWith("H")).collect(Collectors.toList());
        System.out.println(names);


        //this list is mutable in nature.
        //List<Integer> list2 = new ArrayList<>();
    }
    
}
