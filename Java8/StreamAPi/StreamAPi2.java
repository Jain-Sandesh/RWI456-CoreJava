package Java8.StreamAPi;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student
{
    int sid;
    String rollNo;
    String address;
    String name;

    public Student(int sid, String rollNo, String name, String address)
    {
        super();
        this.sid = sid;
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
    }
}

public class StreamAPi2 {

    public static void main(String[] args) {
        
        List<Student> students = new ArrayList<>();

        students.add(new Student(101, "RWI456", "Sandesh Jain", "Pendra Road"));
        students.add(new Student(102, "RWI465", "Swapnil Nema", "Pune"));
        students.add(new Student(103, "RWI546", "Uday Rajoriya", "Jabalpur"));
        students.add(new Student(104, "RWI564", "Vijoy Paul", "Mumbai"));
        students.add(new Student(105, "RWI654", "Shubhodeep Goswami", "Nagpur"));
        students.add(new Student(105, "RWI645", "Sohail Mansoori", "Hybrid"));

        System.out.print("Student names whose id number is greater tha '103' are -> ");
        List<String> stateList1 = students.stream()
                                    .filter(f->f.sid >= 103) //filtering
                                    .map(m->m.name) // fetching
                                    .collect(Collectors.toList()); //after filtering and fetching collect the remaining result.

        System.out.println(stateList1);


        System.out.print("Student name present at address Pendra Road is -> ");
        List<String> stateList2 = students.stream()
                                    .filter(f->f.address == "Pendra Road") // filtering
                                    .map(m->m.name) // fetching
                                    .collect(Collectors.toList()); //after filtering and fetching collect the remaining result.

        System.out.println(stateList2);
        
    }
    
}
