import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


//HashSet-unordered and TreeSet-ordered
public class HashSetEx {
    public static void main(String[] args) {
        Set<Integer> nums=new HashSet<Integer>();
        nums.add(15);
        nums.add(28);
        nums.add(36);
        nums.add(49);

        for(Integer i:nums){
            System.out.println(i+1);
        }
        Iterator<Integer> it=nums.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            
        }
        
    }
}
