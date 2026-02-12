import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
// we can Comparator or Comparable interfaces
class Student implements Comparable<Student>{
    int age;
    String name;
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    @Override
    public int compareTo(Student o) {
        return this.age>o.age?1:-1;
    }
    
}
public class ComparatorEx {
    public static void main(String[] args) {
        List<Student> ls=new ArrayList<>();
        ls.add(new Student(21, "suresh"));
        ls.add(new Student(11, "haresh"));
        ls.add(new Student(35, "naresh"));
        ls.add(new Student(9, "venkatesh"));

        Comparator<Student> com=(i,j)->i.age>j.age?1:-1;

        Collections.sort(ls);
        for(Student s:ls){
            System.out.println(s.name+" : "+s.age);
        }
        
    }
}
