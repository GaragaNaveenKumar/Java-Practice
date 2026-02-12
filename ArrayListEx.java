import java.util.ArrayList;
import java.util.List;

//collections Arraylist
public class ArrayListEx {
    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        for(Integer i:nums){
            System.out.println(i+1);
        }
    }
}
