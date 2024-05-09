package Java8.StreamAPi;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

class CeilingFan
{
    String pid;
    String pname;
    int price;
    String brandname;

    CeilingFan(String pid, String pname, int price, String brandname)
    {
        this.pid = pid;
        this. pname = pname;
        this. price = price;
        this.brandname = brandname;
    }
}


public class StreamAPi3 {

    public static void main(String[] args) {
        
        List<CeilingFan> cf = new ArrayList<>();

        cf.add(new CeilingFan("HVLS101,", "Comfort Air Deco", 10000, "HAVELLS"));
        cf.add(new CeilingFan("ORNT101,", "Wendy", 8000, "ORIENT"));
        cf.add(new CeilingFan("USHA105", "Racer Chrome", 6000, "USHA"));
        cf.add(new CeilingFan("KWW110", "Swinger", 2500, "KWW"));
        cf.add(new CeilingFan("CPTN115", "Aura", 4000, "CROMPTON"));

        System.out.print("The brand name whose fan is costiler than Rs.6000/- are -> ");
        List<String> fanName = cf.stream()
                            .filter(f->f.price >= 6000)
                            .map(m->m.brandname)
                            .collect(Collectors.toList());

        System.out.print(fanName);
    }
}
